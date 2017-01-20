package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class Player extends AppCompatActivity implements Serializable
{
    private String name;
    private int level;
    private int XP;
    private int XPToNextLevel;
    private double maxHealth;
    private double health;
    private double damage;
    private int herbs;
    private int ores;
    private int soulDust;

    Player(String name, int level, int XP, int XPToNextLevel, double maxHealth, double damage, int herbs, int ores, int soulDust)
    {
        this.name = name;
        this.level = level;
        this.XP = XP;
        this.XPToNextLevel = XPToNextLevel;
        this.maxHealth = maxHealth;
        health = maxHealth;
        this.damage = damage;
        this.herbs = herbs;
        this.ores = ores;
        this.soulDust = soulDust;
    }

    Player()
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
    public void increaseXP(int amount)
    {
        XP += amount;
    }
    public void levelUp()
    {
        level += 1;
        XP = XP - XPToNextLevel;
        XPToNextLevel = (XPToNextLevel * 2);
        maxHealth *= 1.2;
        health = maxHealth;
        damage *= 1.2;
    }
    public int getXP()
    {
        return XP;
    }
    public int getXPToNextLevel() { return XPToNextLevel; }
    public void setHealth(double health)
    {
        this.health = health;
    }
    public double getMaxHealth() { return maxHealth; }
    public double getHealth()
    {
        return health;
    }
    public void takeDamage(double amount)
    {
        health -= amount;
    }
    public double strike() { return damage; }
    public double getDamage()
    {
        return damage;
    }
    public void increaseHerbs(int amount)
    {
    herbs += amount;
    }
    public int getHerbs() { return herbs; }
    public int getOres() { return ores; }
    public int getSoulDust() { return soulDust; }
}
