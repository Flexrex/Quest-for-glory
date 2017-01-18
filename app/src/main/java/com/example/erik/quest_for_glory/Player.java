package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Player extends AppCompatActivity
{
    private String name;
    private int level;
    private int XP;
    private int health;
    private int damage;
    Player player;

    Player(String name, int level, int XP, int health, int damage)
    {
        this.name = name;
        this.level = level;
        this.XP = XP;
        this.health = health;
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

        player = new Player("Erko", 1, 0, 100, 20);

        Intent intentQuests = new Intent(this, Quests.class);
        intentQuests.putExtra("player level", player.getLevel());
        intentQuests.putExtra("player XP", player.XP);

        Intent intentTheForest = new Intent(this, TheForest.class);
        intentTheForest.putExtra("player health", player.getHealth());
        intentTheForest.putExtra("player damage", player.getDamage());
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
    public void increaseXP(int amount)
    {
        XP += amount;
    }
    public int getXP()
    {
        return XP;
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
