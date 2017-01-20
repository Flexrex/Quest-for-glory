package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class Monster extends AppCompatActivity implements Serializable
{
    private String name;
    private int maxLevel;
    private int level;
    private int XPYield;
    private double maxHealth;
    private double health;
    private double damage;
    private int herbYield;
    private int oreYield;
    private int soulDustYield;

    Monster(String name, int maxLevel, int XPYield, int maxHealth, double damage, int herbYield, int oreYield, int soulDustYield)
    {
        this.name = name;
        this.maxLevel = maxLevel;
        level = maxLevel;
        this.XPYield = XPYield;
        this.maxHealth = maxHealth;
        health = maxHealth;
        this.damage = damage;
        this.herbYield = herbYield;
        this.oreYield = oreYield;
        this.soulDustYield = soulDustYield;
    }

    Monster()
    {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);
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
    public int getXPYield()
    {
        return XPYield;
    }
    public int getHerbYield() { return herbYield; }
    public void levelUp()
    {
        level += 1;
        maxHealth *= 1.4;
        health = maxHealth;
        damage *= 1.4;
        herbYield *= 1.5;
    }
    public void levelDown()
    {
        level -= 1;
        maxHealth /= 1.4;
        health = maxHealth;
        damage /= 1.4;
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