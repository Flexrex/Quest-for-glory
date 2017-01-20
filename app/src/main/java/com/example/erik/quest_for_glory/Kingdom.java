package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Kingdom extends AppCompatActivity
{
    Player player;
    Monster spriggan;
    TextView level;
    TextView XP;
    TextView herbs;
    TextView ores;
    TextView soulDust;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kingdom);
        level = (TextView) findViewById(R.id.levelText);
        XP = (TextView) findViewById(R.id.XPText);
        herbs = (TextView) findViewById(R.id.herbs);
        ores = (TextView) findViewById(R.id.ores);
        soulDust = (TextView) findViewById(R.id.soulDust);
        player = (Player) getIntent().getSerializableExtra("player");
        spriggan = (Monster) getIntent().getSerializableExtra("spriggan");
        String playerLevelText = getString(R.string.level_text ) + " " + player.getLevel();
        String playerXPText = getString(R.string.XP_text) + " " + player.getXP() + " / " + player.getXPToNextLevel();
        String herbsText = "  Herbs: " + player.getHerbs();
        String oresText = "  Ores: " + player.getOres();
        String soulDustText = "  Soul Dust: " + player.getSoulDust();
        level.setText(playerLevelText);
        XP.setText(playerXPText);
        herbs.setText(herbsText);
        ores.setText(oresText);
        soulDust.setText(soulDustText);
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
