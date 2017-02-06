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

        player = new Player(true, "Erko", 1, 0, 200, 100, 8, 0, 0, 0, 0);
        spriggan = new Monster(true, "Spriggan", 1, 50, 80, 3, 6, 2, 2, 2);
        healthPotion = new Potion(1, 0, 50, 12, 9, 3, 60, 0, 0, 0);
    }
    public void Done(View view)
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