package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class chCreate extends AppCompatActivity
{
    Intent intent;
    Bundle bundle;
    Player player;
    Monster spriggan;
    Potion healthPotion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_create);
        player = new Player("Erko", 1, 0, 200, 100, 8, 0, 0, 0, 0);
        spriggan = new Monster("Spriggan", 1, 50, 70, 3, 6, 2, 2, 2);
        healthPotion = new Potion("")

    }
    public void Done(View view)
    {
        intent = new Intent(this, Quests.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}