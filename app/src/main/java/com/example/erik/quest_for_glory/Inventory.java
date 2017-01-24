package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Inventory extends AppCompatActivity
{
    Intent intent;
    Bundle bundle;
    Player player;
    Monster spriggan;
    Potion healthPotion;
    TextView level;
    TextView XP;
    String LevelText;
    String XPText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        player = (Player) getIntent().getSerializableExtra("player");
        spriggan = (Monster) getIntent().getSerializableExtra("spriggan");
        healthPotion = (Potion) getIntent().getSerializableExtra("healthPotion");

        level = (TextView) findViewById(R.id.level);
        XP = (TextView) findViewById(R.id.XP);

        LevelText = getString(R.string.level_text ) + " " + player.getLevel();
        XPText = getString(R.string.XP_text) + " " + player.getXP() + " / " + player.getXPToNextLevel();

        level.setText(LevelText);
        XP.setText(XPText);
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
    public void quests(View view)
    {
        intent = new Intent(this, Quests.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
