package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class Quests extends AppCompatActivity
{
    TextView levelText;
    TextView XPText;
    int XP;
    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);
        levelText = (TextView) findViewById(R.id.levelText);
        XPText = (TextView) findViewById(R.id.XPText);

        player = (Player) getIntent().getSerializableExtra("player");

        String playerLevelText = getString(R.string.level_text ) + " " + player.getLevel();
        String playerXPText = getString(R.string.XP_text) + " " + player.getXP() + " / " + player.getXPToNextLevel();

        levelText.setText(playerLevelText);
        XPText.setText(playerXPText);

    }
    public void theForest(View view)
    {
        Intent intent = new Intent(this, TheForest.class);
        startActivity(intent);
    }
}
