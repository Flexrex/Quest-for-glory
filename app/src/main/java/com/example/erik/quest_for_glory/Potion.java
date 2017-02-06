package com.example.erik.quest_for_glory;

import android.support.v7.app.AppCompatActivity;
import java.io.Serializable;

public class Potion extends AppCompatActivity implements Serializable
{
    private int level;
    private int amount;
    private double upgradeCost;
    private double goldCost;
    private double goldWorth;
    private double herbCost;
    private double healthBuff;
    private double damageBuff;
    private double critChanceBuff;
    private double defenseBuff;

    public Potion(int level, int amount, double upgradeCost, double goldCost, double goldWorth, double herbCost, double healthBuff, double damageBuff, double critChanceBuff, double defenseBuff)
    {
        this.level = level;
        this.amount = amount;
        this.upgradeCost = upgradeCost;
        this.goldCost = goldCost;
        this.goldWorth = goldWorth;
        this.herbCost = herbCost;
        this.healthBuff = healthBuff;
        this.damageBuff = damageBuff;
        this.critChanceBuff = critChanceBuff;
        this.critChanceBuff = defenseBuff;
    }
    public int getLevel() { return level; }
    public int getAmount() { return amount; }
    public double getUpgradeCost() { return upgradeCost + amount * goldCost * 1.4; }
    public double getGoldCost() { return goldCost; }
    public double getGoldWorth() { return goldWorth; }
    public double getHerbCost() { return herbCost; }
    public double getHealthBuff() { return healthBuff; }
    public double getDamageBuff() { return damageBuff; }
    public double getCritChanceBuff() { return critChanceBuff; }
    public double getDefenseBuff() { return defenseBuff; }
    public void increaseAmount() { amount += 1; }
    public void decreaseAmount() { amount -= 1; }
    public void upgrade()
    {
        level += 1;
        upgradeCost *= 1.4;
        goldCost *= 1.4;
        goldWorth *= 1.4;
        herbCost *= 1.4;
        healthBuff *= 1.5;
        damageBuff *= 1.5;
        critChanceBuff *= 1.2;
        defenseBuff *= 1.5;
    }
}