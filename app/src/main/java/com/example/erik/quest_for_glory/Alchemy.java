package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Alchemy extends AppCompatActivity
{
    Intent intent;
    Bundle bundle;
    Player player;
    Monster spriggan;
    TextView level;
    TextView XP;
    TextView herbs;
    TextView gold;
    TextView healthPotion;
    String levelText;
    String XPText;
    String herbsText;
    String goldText;
    String healthPotionText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alchemy);

        player = (Player) getIntent().getSerializableExtra("player");
        spriggan = (Monster) getIntent().getSerializableExtra("spriggan");

        level = (TextView) findViewById(R.id.levelText);
        XP = (TextView) findViewById(R.id.XPText);
        herbs = (TextView) findViewById(R.id.herbs);
        gold = (TextView) findViewById(R.id.gold);
        healthPotion = (TextView) findViewById(R.id.healthPotion);

        levelText = getString(R.string.level_text ) + " " + player.getLevel();
        XPText = getString(R.string.XP_text) + " " + player.getXP() + " / " + player.getXPToNextLevel();
        herbsText = " Herbs: " + (int) player.getHerbs();
        goldText = " Gold: " + (int) player.getGold();
        healthPotionText = "Health Potion Level" + healthPotion.getLevel()  \n+ 40 Health (1)"

        level.setText(levelText);
        XP.setText(XPText);
        herbs.setText(herbsText);
        gold.setText(goldText);
    }
    public void greed(View view)
    {
        intent = new Intent(this, Greed.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void inventory(View view)
    {
        intent = new Intent(this, Inventory.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void skills(View view)
    {
        intent = new Intent(this, Skills.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void gear(View view)
    {
        intent = new Intent(this, Gear.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void kingdom(View view)
    {
        intent = new Intent(this, Kingdom.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void quests(View view)
    {
        intent = new Intent(this, Quests.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}