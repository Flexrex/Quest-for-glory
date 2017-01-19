package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Greed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greed);
    }
    public void greed(View view)
    {
        Intent intent = new Intent(this, Greed.class);
        startActivity(intent);
    }
    public void inventory(View view)
    {
        Intent intent = new Intent(this, Inventory.class);
        startActivity(intent);
    }
    public void skills(View view)
    {
        Intent intent = new Intent(this, Skills.class);
        startActivity(intent);
    }
    public void gear(View view)
    {
        Intent intent = new Intent(this, Gear.class);
        startActivity(intent);
    }
    public void kingdom(View view)
    {
        Intent intent = new Intent(this, Kingdom.class);
        startActivity(intent);
    }
    public void quests(View view)
    {
        Intent intent = new Intent(this, Quests.class);
        startActivity(intent);
    }
}
