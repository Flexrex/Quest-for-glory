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
    private int health;
    private int maxHealth;
    private int damage;

    Player(String name, int level, int XP, int XPToNextLevel, int maxHealth, int damage)
    {
        this.name = name;
        this.level = level;
        this.XP = XP;
        this.XPToNextLevel = XPToNextLevel;
        this.maxHealth = maxHealth;
        health = maxHealth;
        this.damage = damage;
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
        damage *= 1.2;
    }
    public int getXP()
    {
        return XP;
    }
    public int getXPToNextLevel() { return XPToNextLevel; }
    public void setHealth(int health)
    {
        this.health = health;
    }
    public int getHealth()
    {
        return health;
    }
    public int getMaxHealth() { return maxHealth; }
    public void takeDamage(int amount)
    {
        health -= amount;
    }
    public int strike() { return damage; }
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    public int getDamage()
    {
        return damage;
    }
}
