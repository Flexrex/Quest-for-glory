package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public final static String EXTRA_MESSAGE = "com.example.eriko.quest-for-glory.MESSAGE";
    private int theLevel = 0;
    int test;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button change = (Button) findViewById(R.id.change);
    }

    public void OnQuests(View view)
    {
        TextView level = (TextView) findViewById(R.id.level);
        theLevel++;
        level.setText("level" + theLevel);
        Intent intent = new Intent(this, OnQuests.class);
        startActivity(intent);

    }

}
