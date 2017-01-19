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
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_forest);
        playerHealthBar = (TextView) findViewById(R.id.playerHealthBar);
        sprigganHealthBar = (TextView) findViewById(R.id.sprigganHealthBar);;
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
        player.takeDamage(spriggan.getDamage());
        playerHealthText = "Health: " + player.getHealth();
        playerHealthBar.setText(playerHealthText);
    }
}