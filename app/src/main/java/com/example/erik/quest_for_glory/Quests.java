package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Quests extends AppCompatActivity
{
    Intent intent;
    Bundle bundle;
    Player player;
    Monster spriggan;
    Potion healthPotion;
    TextView level;
    TextView XP;
    TextView theForest;
    TextView theMountain;
    TextView theRuin;
    TextView theForestReward;
    TextView theMountainReward;
    TextView TheRuinReward;
    String playerLevelText;
    String playerXPText;
    String theForestText;
    String theMountainText;
    String theRuinText;
    String theForestRewardText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);

        player = (Player) getIntent().getSerializableExtra("player");
        spriggan = (Monster) getIntent().getSerializableExtra("spriggan");
        healthPotion = (Potion) getIntent().getSerializableExtra("healthPotion");

        level= (TextView) findViewById(R.id.level);
        XP = (TextView) findViewById(R.id.XP);
        theForest = (TextView) findViewById(R.id.theForest);
        theMountain = (TextView) findViewById(R.id.theMountain);
        theRuin = (TextView) findViewById(R.id.theRuin);
        theForestReward = (TextView) findViewById(R.id.theForestRewards);

        playerLevelText = "Level " + player.getLevel();
        playerXPText = "XP " + player.getXP() + " / " + player.getXPToNextLevel();
        theForestText = "The Forest\nLevel " + spriggan.getLevel();
        theMountainText = "The Mountain\nLevel " + 0;
        theRuinText = "The Ruin\nLevel " + 0;
        theForestRewardText = "Rewards " + (int) spriggan.getHerbYield() + " Herbs" + " and " + (int) spriggan.getGoldYield() + " Gold";

        level.setText(playerLevelText);
        XP.setText(playerXPText);
        theForest.setText(theForestText);
        theMountain.setText(theMountainText);
        theRuin.setText(theRuinText);
        theForestReward.setText(theForestRewardText);
    }
    public void increaseTheForestLevel(View view)
    {
        spriggan.levelUp();
        if(spriggan.getLevel() > spriggan.getMaxLevel())
        {
            spriggan.levelDown();
        }
        theForestText = "The Forest\nLevel " + spriggan.getLevel();
        theForestRewardText = "Rewards " + (int) spriggan.getHerbYield() + " Herbs" + " and " + (int) spriggan.getGoldYield() + " Gold";
        theForest.setText(theForestText);
        theForestReward.setText(theForestRewardText);
    }
    public void decreaseTheForestLevel(View view)
    {
        spriggan.levelDown();
        if(spriggan.getLevel() <= 0)
        {
            spriggan.levelUp();
        }
        theForestText = "The Forest\nLevel " + spriggan.getLevel();
        theForestRewardText = "Rewards " + (int) spriggan.getHerbYield() + " Herbs" + " and " + (int) spriggan.getGoldYield() + " Gold";
        theForest.setText(theForestText);
        theForestReward.setText(theForestRewardText);
    }
    public void theForest(View view)
    {
        intent = new Intent(this, TheForest.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void greed(View view)
    {
        intent = new Intent(this, Greed.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void inventory(View view)
    {
        intent = new Intent(this, Inventory.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void skills(View view)
    {
        intent = new Intent(this, Skills.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void gear(View view)
    {
        intent = new Intent(this, Gear.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void kingdom(View view)
    {
        intent = new Intent(this, Kingdom.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
