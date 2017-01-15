package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class OnQuests extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_quests);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView1 = new TextView(this);
        textView1.setTextSize(40);
        textView1.setText(message);
        TextView textView2 = new TextView(this);
        textView2.setTextSize(40);
        textView2.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_on_quests);
        layout.addView(textView1);
        layout.addView(textView2);
    }
}
