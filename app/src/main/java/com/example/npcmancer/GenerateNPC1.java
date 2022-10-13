package com.example.npcmancer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GenerateNPC1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_npc1);
    }

    private String mRace;
    private String mGender;

    public void chooseRaceButton(View view) {

        switch (view.getId()) {
            case R.id.dragonbornImageButton:
                mRace = "Dragonborn";
                break;
            case R.id.dwarfImageButton:
                mRace = "Dwarf";
                break;
            case R.id.elfImageButton:
                mRace = "Elf";
                break;
            case R.id.gnomeImageButton:
                mRace = "Gnome";
                break;
            case R.id.halfElfImageButton:
                mRace = "Half-ELf";
                break;
            case R.id.halflingImageButton:
                mRace = "Halfling";
                break;
            case R.id.halfOrcImageButton:
                mRace = "Half-Orc";
                break;
            case R.id.humanImageButton:
                mRace = "Human";
                break;
            case R.id.tieflingImageButton:
                mRace = "Tiefling";
                break;
        }

    }

    public void chooseGenderButton(View view) {
        switch (view.getId()) {
            case R.id.maleButtonNPC1:
                mGender = "Male";
                break;
            case R.id.femaleButtonNPC1:
                mGender = "Female";
                break;
            case R.id.nonGenderedButtonNPC1:
                mGender = "Non-gendered";
                break;
        }
    }

    // go to next GenerateNPC2 button click
    public void toGenerateNPC2(View view) {

        // start GenerateNPC2
        Intent intent = new Intent(this, GenerateNPC2.class);

        intent.putExtra("Race", mRace);
        intent.putExtra("Gender", mGender);
        startActivity(intent);
    }

    // retrieve data from GenerateNPC2
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1) {
            if(resultCode == RESULT_OK) {
                mRace = data.getStringExtra("Race");
                mGender = data.getStringExtra("Gender");
            }
        }
    }
}