package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TheForest extends AppCompatActivity
{
    TextView playerHealthText;
    TextView monsterHealthText;
    int playerHealth;
    int playerDamage;
    int monsterHealth;
    int monsterDamage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_forest);

        Intent intent = getIntent();
        playerHealth = intent.getIntExtra("player health", 0);
        playerDamage = intent.getIntExtra("player damage", 0);
    }
}