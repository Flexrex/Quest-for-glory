package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TheForest extends AppCompatActivity
{
    Player player;
    Monster spriggan;
    TextView playerHealthBar;
    TextView sprigganHealthBar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_forest);

        player = (Player) getIntent().getSerializableExtra("player");
        spriggan = (Monster) getIntent().getSerializableExtra("spriggan");

        String playerHealthText = "Health: " + player.getHealth();


        playerHealthBar.setText(playerHealthText);

    }
    public void strike()
    {

    }
}