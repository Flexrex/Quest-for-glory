package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Quests extends AppCompatActivity
{
    Player player;
    TextView levelText;
    TextView XPText;
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
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void greed(View view)
    {
        Intent intent = new Intent(this, Greed.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void inventory(View view)
    {
        Intent intent = new Intent(this, Inventory.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void skills(View view)
    {
        Intent intent = new Intent(this, Skills.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void gear(View view)
    {
        Intent intent = new Intent(this, Gear.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void kingdom(View view)
    {
        Intent intent = new Intent(this, Kingdom.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void quests(View view)
    {
        Intent intent = new Intent(this, Quests.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
