package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TheForest extends AppCompatActivity
{
    Player player;
    Monster spriggan;
    TextView playerHealthBar;
    TextView sprigganHealthBar;
    String playerHealthText;
    String sprigganHealthText;
    Thread thread;
    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_forest);
        playerHealthBar = (TextView) findViewById(R.id.playerHealthBar);
        sprigganHealthBar = (TextView) findViewById(R.id.sprigganHealthBar);
        player = (Player) getIntent().getSerializableExtra("player");
        spriggan = (Monster) getIntent().getSerializableExtra("spriggan");
        playerHealthText = "Health: " + player.getHealth();
        sprigganHealthText = "Health: " + spriggan.getHealth();
        playerHealthBar.setText(playerHealthText);
        sprigganHealthBar.setText(sprigganHealthText);
    }
    public void strike(View view)
    {
        spriggan.takeDamage(player.strike());
        sprigganHealthText = "Health: " + spriggan.getHealth();
        sprigganHealthBar.setText(sprigganHealthText);
        checkSprigganAlive();
        player.takeDamage(spriggan.getDamage());
        playerHealthText = "Health: " + player.getHealth();
        playerHealthBar.setText(playerHealthText);
        checkPlayerAlive();
    }
    public void checkPlayerAlive()
    {
        if(player.getHealth() <= 0)
        {
            Intent intent = new Intent(this, Quests.class);
            Bundle bundle = new Bundle();
            player.setHealth(player.getMaxHealth());
            spriggan.setHealth(spriggan.getMaxHealth());
            bundle.putSerializable("player", player);
            bundle.putSerializable("spriggan", spriggan);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
    public void checkSprigganAlive()
    {
        if(spriggan.getHealth() <= 0)
        {
            Intent intent = new Intent(this, Quests.class);
            Bundle bundle = new Bundle();
            player.increaseXP(spriggan.getXPYield());
            player.increaseHerbs(spriggan.getHerbYield());
            if(player.getXP() >= player.getXPToNextLevel())
            {
                player.levelUp();
                spriggan.levelUp();
            }
            player.setHealth(player.getMaxHealth());
            spriggan.setHealth(spriggan.getMaxHealth());
            bundle.putSerializable("player", player);
            bundle.putSerializable("spriggan", spriggan);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}