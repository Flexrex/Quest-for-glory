package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OnQuests extends AppCompatActivity
{
    TextView levelText;
    int playerLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_quests);

        Intent intent = getIntent();
        playerLevel = intent.getIntExtra("player level", 0);
        levelText = (TextView) findViewById(R.id.levelText);
        levelText.setText("Level " + playerLevel);
    }

    public void OnQuests2(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        levelText.setText("Level " + playerLevel);
        startActivity(intent);
    }
}
