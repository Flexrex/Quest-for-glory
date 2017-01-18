package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Monster extends AppCompatActivity
{
    private String name;
    private int level;
    private int health;
    private int damage;

    Monster spriggan;

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

        spriggan = new Monster("Erko", 1, 80, 15);

        Intent intentQuests = new Intent(this, Quests.class);
        intentQuests.putExtra("spriggan level", spriggan.getLevel());

        Intent intentTheForest = new Intent(this, TheForest.class);
        intentTheForest.putExtra("spriggan health", spriggan.getHealth());
        intentTheForest.putExtra("spriggan damage", spriggan.getDamage());
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void increaseLevel()
    {
        level += 1;
    }
    public int getLevel()
    {
        return level;
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