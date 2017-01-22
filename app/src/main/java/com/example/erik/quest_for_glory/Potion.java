package com.example.erik.quest_for_glory;

import android.support.v7.app.AppCompatActivity;
import java.io.Serializable;

public class Potion extends AppCompatActivity implements Serializable
{
    private int level;
    private double herbCost;
    private double buffHealth;
    private double buffHealthRegen;
    private double buffDamage;
    private double buffCritChance;
    private double buffDefense;

    public Potion(int level, double herbCost)
    {
        this.level = level;
        this.herbCost = herbCost;
    }
    public void healthLevelUp()
    {
        level += 1;
        buffHealth *= 1.5;
        herbCost *= 1.4;
    }
    public void healthRegenLevelUp()
    {
        level += 1;
        buffHealthRegen *= 1.5;
        herbCost *= 1.4;
    }
    public void damageLevelUp()
    {
        level += 1;
        buffDamage *= 1.5;
        herbCost *= 1.4;
    }
    public void critChanceLevelUp()
    {
        level += 1;
        buffCritChance *= 1.2;
        herbCost *= 6;
    }
    public void buffDefenseLevelUp()
    {
        level += 1;
        buffDefense *= 1.5;
        herbCost *= 1.4;
    }
    public void setBuffHealth(double buffHealth)
    {
        this.buffHealth = buffHealth;
    }
    public void setBuffHealthRegen(double buffHealthRegen)
    {
        this.buffHealthRegen = buffHealthRegen;
    }
    public void setBuffDamage(double buffDamage)
    {
        this.buffDamage = buffDamage;
    }
    public void setBuffCritChance(double critChance)
    {
        this.buffCritChance = critChance;
    }
    public void setBuffDefense(double buffDefense)
    {
        this.buffDefense = buffDefense;
    }
    public int getLevel()
    {
        return level;
    }
    public double getHerbCost()
    {
        return herbCost;
    }
    public double getBuffHealth()
    {
        return buffHealth;
    }
    public double getBuffHealthRegen()
    {
        return buffHealthRegen;
    }
    public double getBuffDamage()
    {
        return buffDamage;
    }
    public double getBuffCritChance()
    {
        return buffCritChance;
    }
    public double getBuffDefense()
    {
        return buffDefense;
    }
}