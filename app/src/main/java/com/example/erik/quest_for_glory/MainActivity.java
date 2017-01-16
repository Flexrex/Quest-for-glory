package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private String name;
    private int level;
    private int XP;
    private int health;
    private int damage;
    MainActivity player;
    TextView levelText;

    MainActivity(String name, int level, int XP, int health, int damage)
    {
        this.name = name;
        this.level = level;
        this.XP = XP;
        this.health = health;
        this.damage = damage;
    }

    MainActivity()
    {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        levelText = (TextView) findViewById(R.id.levelText);
        player = new MainActivity("Erko", 1, 0, 100, 20);
        levelText.setText("Level " + player.getLevel());
    }

    public void OnQuests1(View view)
    {
        Intent intent = new Intent(this, OnQuests.class);
        player.increaseLevel();
        levelText.setText("Level " + player.getLevel());
        intent.putExtra("player level", player.getLevel());
        startActivity(intent);
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
    public void setDamage(int health)
    {
        this.health = health;
    }
    public int getDamage()
    {
        return health;
    }
}
