package com.example.npcmancer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GenerateNPC3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_npc3);

        // get data from GenerateNPC2
        Intent intent = getIntent();
        String Race = intent.getStringExtra("Race");
        String Gender = intent.getStringExtra("Gender");
        String Name = intent.getStringExtra("Name");

        // display the data to TextViews
        TextView raceTextView = (TextView) findViewById(R.id.raceTextViewNPC3);
        raceTextView.setText(Race);
        TextView genderTextView = (TextView) findViewById(R.id.genderTextViewNPC3);
        genderTextView.setText(Gender);
        TextView nameTextView = (TextView) findViewById(R.id.genderTextViewNPC3);
        nameTextView.setText(Name);
    }

    private String mRace = findViewById(R.id.raceTextViewNPC3).toString();
    private String mGender = findViewById(R.id.genderTextViewNPC3).toString();
    private String mName = findViewById(R.id.nameTextViewNPC3).toString();

    public void chooseStatblockButton(View view) {
        switch (view.getId()) {
            case R.id.acolyteNPC3:
                // insert statblock assign code

                break;
            case R.id.archmageNPC3:

                break;
            case R.id.assassinNPC3:

                break;
            case R.id.banditNPC3:
                // insert statblock assign code

                break;
            case R.id.banditCaptainNPC3:

                break;
            case R.id.berserkerNPC3:

                break;
            case R.id.commonerNPC3:
                // insert statblock assign code

                break;
            case R.id.cultistNPC3:

                break;
        }
    }
}