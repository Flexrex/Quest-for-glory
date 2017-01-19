package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class Monster extends AppCompatActivity implements Serializable
{
    private String name;
    private int level;
    private int health;
    private int damage;

    Monster(String name, int level, int health, int damage)
    {
        this.name = name;
        this.level = level;
        this.health = health;
        this.damage = damage;
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
    public void setLevel(int level)
    {
        this.level = level;
    }
    public int getLevel()
    {
        return level;
    }
    public void levelUp()
    {
        level += 1;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
    public int getHealth()
    {
        return health;
    }
    public void takeDamage() { int amount; }
    public void dealDamage() { int amount; }
    public void setDamage(int health)
    {
        this.health = health;
    }
    public int getDamage()
    {
        return health;
    }
}