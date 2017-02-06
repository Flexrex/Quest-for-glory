package com.example.erik.quest_for_glory;

import android.support.v7.app.AppCompatActivity;
import java.io.Serializable;

public class Player extends AppCompatActivity implements Serializable
{
    private boolean alive;
    private String name;
    private int level;
    private int XP;
    private int XPToNextLevel;
    private double maxHealth;
    private double health;
    private double damage;
    private double gold;
    private double herbs;
    private double ores;
    private double soulDust;

    Player(boolean alive, String name, int level, int XP, int XPToNextLevel, double maxHealth, double damage, double gold, double herbs, double ores, double soulDust)
    {
        this.alive = alive;
        this.name = name;
        this.level = level;
        this.XP = XP;
        this.XPToNextLevel = XPToNextLevel;
        this.maxHealth = maxHealth;
        health = maxHealth;
        this.damage = damage;
        this.gold = gold;
        this.herbs = herbs;
        this.ores = ores;
        this.soulDust = soulDust;
    }
    public boolean getAlive() { return alive; }
    public String getName()
    {
        return name;
    }
    public int getLevel() { return level; }
    public int getXP() { return XP; }
    public int getXPToNextLevel() { return XPToNextLevel; }
    public double getMaxHealth() { return maxHealth; }
    public double getHealth() { return health; }
    public double getDamage() { return damage; }
    public double getGold() { return gold; }
    public double getHerbs() { return herbs; }
    public double getOres() { return ores; }
    public double getSoulDust() { return soulDust; }
    public double strike() { return damage; }
    public void setAlive(boolean alive){ this.alive = alive;}
    public void setName(String name) { this.name = name; }
    public void setHealth(double amount) { this.health = amount; }
    public void takeDamage(double amount) { health -= amount; }
    public void increaseHealth(double amount) { health += amount; }
    public void increaseXP(double amount) { XP += amount; }
    public void increaseGold(double amount) { gold += amount; }
    public void increaseHerbs(double amount) { herbs += amount; }
    public void decreaseGold(double amount) { gold -= amount; }
    public void decreaseHerbs(double amount) { herbs -= amount; }
    public void levelUp()
    {
        level += 1;
        XP = XP - XPToNextLevel;
        XPToNextLevel = (XPToNextLevel * 2);
        maxHealth *= 1.2;
        health = maxHealth;
        damage *= 1.2;
    }
}