package com.example.erik.quest_for_glory;

import android.support.v7.app.AppCompatActivity;
import java.io.Serializable;

public class Monster extends AppCompatActivity implements Serializable
{
    private String name;
    private int maxLevel;
    private int level;
    private double XPYield;
    private double maxHealth;
    private double health;
    private double damage;
    private double goldYield;
    private double herbYield;
    private double oreYield;
    private double soulDustYield;

    Monster(String name, int maxLevel, double XPYield, int maxHealth, double damage, double goldYield, double herbYield, double oreYield, double soulDustYield)
    {
        this.name = name;
        this.maxLevel = maxLevel;
        level = maxLevel;
        this.XPYield = XPYield;
        this.maxHealth = maxHealth;
        health = maxHealth;
        this.damage = damage;
        this.goldYield = goldYield;
        this.herbYield = herbYield;
        this.oreYield = oreYield;
        this.soulDustYield = soulDustYield;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getMaxLevel() { return maxLevel; }
    public void increaseMaxLevel() { maxLevel += 1; }
    public int getLevel()
    {
        return level;
    }
    public double getXPYield()
    {
        return XPYield;
    }
    public double getGoldYield() { return goldYield; }
    public double getHerbYield() { return herbYield; }
    public void levelUp()
    {
        level += 1;
        maxHealth *= 1.4;
        health = maxHealth;
        damage *= 1.4;
        XPYield *= 1.5;
        goldYield *= 1.5;
        herbYield *= 1.5;
    }
    public void levelDown()
    {
        level -= 1;
        maxHealth /= 1.4;
        health = maxHealth;
        damage /= 1.4;
        XPYield /= 1.5;
        goldYield /= 1.5;
        herbYield /= 1.5;
    }
    public void setHealth(double health)
    {
        this.health = health;
    }
    public double getMaxHealth() { return maxHealth; }
    public double getHealth()
    {
        return health;
    }
    public void takeDamage(double damage)
    {
        health -= damage;
    }
    public double getDamage()
    {
        return damage;
    }
}