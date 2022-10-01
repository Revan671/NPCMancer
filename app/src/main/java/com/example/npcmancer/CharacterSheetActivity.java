package com.example.npcmancer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CharacterSheetActivity extends AppCompatActivity {

    private int mStr = 0;
    private int mDex = 0;
    private int mCon = 0;
    private int mInt = 0;
    private int mWis = 0;
    private int mCha = 0;
    private String mName;
    private String mRace;
    private String mGender;
    private String mStatblock;
    private String mAlignment;
    private int mAC;
    private int mHP;
    private int mSpeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_sheet);

        // pull user entered data from editable text boxes
        // entered name data
        EditText _name = (EditText) findViewById(R.id.EditableNameText);
        mName = _name.getText().toString();
        // entered armor class data
        EditText _ac = (EditText) findViewById(R.id.ArmorClassValue);
        String _acString = _ac.getText().toString();
        mAC = Integer.parseInt(_acString);
        // entered walking speed data
        EditText _speed = (EditText) findViewById(R.id.WalkingSpeedValue);
        String _speedString = _speed.getText().toString();
        mSpeed = Integer.parseInt(_speedString);
        // entered hp data
        EditText _hp = (EditText) findViewById(R.id.HitPointsValue);
        String _hpString = _hp.getText().toString();
        mHP = Integer.parseInt(_hpString);


        // Not sure which of these implementations is better for pulling ints from editText boxes
        /*EditText _hp = (EditText) findViewById(R.id.HitPointsValue);
        String _hpString = _hp.getText().toString();
        mHP = Integer.parseInt(_hpString);

        or

        mHP = (R.id.HitPointsValue);*/

        mStr = (R.id.StrengthValue);
        mDex = (R.id.DexterityValue);
        mCon = (R.id.ConstitutionValue);
        mInt = (R.id.IntelligenceValue);
        mWis = (R.id.WisdomValue);
        mCha = (R.id.CharismaValue);

        }

    /*@Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent((event));
    }*/

    // these buttons should probably include drop-down menus to display the options available
    // that functionality has not yet been implemented
    /////////////////////////////////////////////////
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
    //////////////////////////////////////////////////


    // currently creates the character
    // need a location to put the object
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