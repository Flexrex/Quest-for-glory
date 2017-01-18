package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Quests extends AppCompatActivity
{
    TextView levelText;
    TextView XPText;
    int playerLevel;
    int playerXP;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);
        levelText = (TextView) findViewById(R.id.levelText);
        XPText = (TextView) findViewById(R.id.XPText);
        Intent intent = getIntent();
        playerLevel = intent.getIntExtra("player level", 0);
        playerXP = intent.getIntExtra("player XP", 0);

    }
    public void theForest(View view)
    {
        Intent intent = new Intent(this, TheForest.class);
        startActivity(intent);
    }
}
