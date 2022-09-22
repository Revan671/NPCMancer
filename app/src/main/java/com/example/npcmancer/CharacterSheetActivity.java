package com.example.npcmancer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CharacterSheetActivity extends AppCompatActivity {

    private int mStr = 0;
    private int mDex = 0;
    private int mCon = 0;
    private int mInt = 0;
    private int mWis = 0;
    private int mCha = 0;
    private TextView mName;
    private String mRace;
    private String mGender;
    private String mStatblock;
    private String mAlignment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_sheet);


        // pull user entered data from editable text boxes
        mName = (TextView) findViewById(R.id.EditableNameText);
        mStr = (R.id.StrengthValue);
        mDex = (R.id.DexterityValue);
        mCha = (R.id.ConstitutionValue);
        mInt = (R.id.IntelligenceValue);
        mWis = (R.id.WisdomValue);
        mCha = (R.id.CharismaValue);



    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent((event));
    }

    public void chooseRace(View view){
        Button b = (Button)view;
        String mRace = b.getText().toString();
    }
    public void chooseGender(View view) {
        Button b = (Button)view;
        String mGender = b.getText().toString();
    }
    public void chooseStatblock(View view) {
        Button b = (Button)view;
        String mStatblock = b.getText().toString();
    }
    public void chooseAlignment(View view) {
        Button b = (Button)view;
        String mAlignment = b.getText().toString();
    }
    public void saveCharacter() {
        Character newCharacter = new Character.CharacterBuilder(mName)
                .str(mStr)
                .dex(mDex)
                .con(mCon)
                .intel(mInt)
                .wis(mWis)
                .cha(mCha)
                .build();
    }
    public void customizeCharacterFurther() {

    }
    public void randomizeCharacter() {

    }
    public void cancelCharacterChanges() {

    }
}