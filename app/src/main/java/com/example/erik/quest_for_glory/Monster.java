package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class Monster extends AppCompatActivity implements Serializable
{
    private String name;
    private int level;
    private int XPYield;
    private int health;
    private int maxHealth;
    private int damage;
    private int herbYield;
    private int oreYield;
    private int soulDustYield;

    Monster(String name, int level, int XPYield, int maxHealth, int damage, int herbYield, int oreYield, int soulDustYield)
    {
        this.name = name;
        this.level = level;
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
        damage *= 1.4;
        herbYield *= 1.5;
    }
    public void levelDown()
    {
        level -= 1;
        maxHealth /= 1.4;
        damage /= 1.4;
        herbYield /= 1.5;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
    public int getHealth()
    {
        return health;
    }
    public int getMaxHealth() { return maxHealth; }
    public void takeDamage(int damage)
    {
        health -= damage;
    }
    public int getDamage()
    {
        return damage;
    }
}