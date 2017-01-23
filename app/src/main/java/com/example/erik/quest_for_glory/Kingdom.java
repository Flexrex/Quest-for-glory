package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Kingdom extends AppCompatActivity
{
    Intent intent;
    Bundle bundle;
    Player player;
    Monster spriggan;
    TextView level;
    TextView XP;
    TextView gold;
    TextView herbs;
    TextView ores;
    TextView soulDust;
    String levelText;
    String XPText;
    String goldText;
    String herbsText;
    String oresText;
    String soulDustText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kingdom);
        level = (TextView) findViewById(R.id.levelText);
        XP = (TextView) findViewById(R.id.XPText);
        gold =(TextView) findViewById(R.id.gold);
        herbs = (TextView) findViewById(R.id.herbs);
        ores = (TextView) findViewById(R.id.ores);
        soulDust = (TextView) findViewById(R.id.soulDust);
        player = (Player) getIntent().getSerializableExtra("player");
        spriggan = (Monster) getIntent().getSerializableExtra("spriggan");
        levelText = getString(R.string.level_text ) + " " + player.getLevel();
        XPText = getString(R.string.XP_text) + " " + player.getXP() + " / " + player.getXPToNextLevel();
        goldText = " Gold: " + (int) player.getGold();
        herbsText = " Herbs: " + (int) player.getHerbs();
        oresText = " Ores: " + (int) player.getOres();
        soulDustText = " Soul Dust: " + (int) player.getSoulDust();
        level.setText(levelText);
        XP.setText(XPText);
        gold.setText(goldText);
        herbs.setText(herbsText);
        ores.setText(oresText);
        soulDust.setText(soulDustText);
    }
    public void alchemy(View view)
    {
        intent = new Intent(this, Alchemy.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
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