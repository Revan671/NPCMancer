package com.example.npcmancer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GenerateNPC2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_npc2);

        // get data from GenerateNPC1
        Intent intent = getIntent();
        String Race = intent.getStringExtra("Race");
        String Gender = intent.getStringExtra("Gender");

        // display the data to TextViews
        TextView raceTextView = (TextView) findViewById(R.id.raceTextViewNPC2);
        raceTextView.setText(Race);
        TextView genderTextView = (TextView) findViewById(R.id.genderTextViewNPC2);
        genderTextView.setText(Gender);
    }

    private String mRace = findViewById(R.id.raceTextViewNPC2).toString();
    private String mGender = findViewById(R.id.genderTextViewNPC2).toString();
    private String mName;

    public void chooseNameButton(View view) {
        Button b = (Button)view;
        String mRace = b.getText().toString();
    }

    // go to next GenerateNPC3 button click
    public void toGenerateNPC3(View view) {

        // start GenerateNPC3
        Intent intent = new Intent(this, GenerateNPC3.class);

        intent.putExtra("Race", mRace);
        intent.putExtra("Gender", mGender);
        intent.putExtra("Name", mName);
        startActivity(intent);
    }

    // go back to GenerateNPC1 button click
    public void toGenerateNPC1(View view) {

        // applicable data to send back to GenerateNPC1
        Intent intent = new Intent();
        intent.putExtra("Race", mRace);
        intent.putExtra("Gender", mGender);
        setResult(RESULT_OK, intent);
        finish();
    }

    // retrieve data from GenerateNPC3
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1) {
            if(resultCode == RESULT_OK) {
                mRace = data.getStringExtra("Race");
                mGender = data.getStringExtra("Gender");
                mName = data.getStringExtra("Name");

                TextView raceTextView = (TextView) findViewById(R.id.raceTextViewNPC2);
                raceTextView.setText(mRace);
                TextView genderTextView = (TextView) findViewById(R.id.genderTextViewNPC2);
                genderTextView.setText(mGender);
            }
        }
    }
}