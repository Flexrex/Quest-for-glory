package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Quests extends AppCompatActivity
{
    Player player;
    Monster spriggan;
    TextView level;
    TextView XP;
    TextView forest;
    TextView mountain;
    TextView ruin;
    String playerLevelText;
    String playerXPText;
    String forestText;
    String mountainText;
    String ruinText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);
        level= (TextView) findViewById(R.id.levelText);
        XP = (TextView) findViewById(R.id.XPText);
        forest = (TextView) findViewById(R.id.forest);
        mountain = (TextView) findViewById(R.id.mountain);
        ruin = (TextView) findViewById(R.id.ruin) ;
        player = (Player) getIntent().getSerializableExtra("player");
        spriggan = (Monster) getIntent().getSerializableExtra("spriggan");
        playerLevelText = getString(R.string.level_text ) + " " + player.getLevel();
        playerXPText = getString(R.string.XP_text) + " " + player.getXP() + " / " + player.getXPToNextLevel();
        forestText = "The Forest\n Level " + spriggan.getLevel();
        mountainText = "The Mountain\n Level " + 0;
        ruinText = "The Ruin\n Level " + 0;
        level.setText(playerLevelText);
        XP.setText(playerXPText);
        forest.setText(forestText);
        mountain.setText(mountainText);
        ruin.setText((ruinText));
    }
    public void theForest(View view)
    {
        Intent intent = new Intent(this, TheForest.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void increaseTheForestLevel(View view)
    {
        spriggan.levelUp();
        if(spriggan.getLevel() > spriggan.getMaxLevel())
        {
            spriggan.levelDown();
        }
        forestText = "The Forest\n Level " + spriggan.getLevel();
        forest.setText(forestText);
    }
    public void decreaseTheForestLevel(View view)
    {
        spriggan.levelDown();
        if(spriggan.getLevel() == 0)
        {
            spriggan.levelUp();
        }
        forestText = "The Forest\n Level " + spriggan.getLevel();
        forest.setText(forestText);
    }
    public void greed(View view)
    {
        Intent intent = new Intent(this, Greed.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void inventory(View view)
    {
        Intent intent = new Intent(this, Inventory.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void skills(View view)
    {
        Intent intent = new Intent(this, Skills.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void gear(View view)
    {
        Intent intent = new Intent(this, Gear.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void kingdom(View view)
    {
        Intent intent = new Intent(this, Kingdom.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void quests(View view)
    {
        Intent intent = new Intent(this, Quests.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
