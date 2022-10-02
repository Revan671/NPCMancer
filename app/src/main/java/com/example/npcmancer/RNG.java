package com.example.npcmancer;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class RNG {
    // Returns a list of names generated from a race's prefix/postfix lists, this list can then be loaded into a UI element for selection.
    public List<String> RandomizeName(Race race, int numOfNames) {
        List<String> results = new ArrayList<String>();

        List<String> fPrefix = race.getNameList(1);
        List<String> fPostfix = race.getNameList(2);
        List<String> lPrefix = race.getNameList(3);
        List<String> lPostfix = race.getNameList(4);
        int nextInt = 0;

        for (int i = 0; i < numOfNames; i++) {
            String name = "";
            Random rand = new Random(System.nanoTime());

            nextInt = rand.nextInt(fPrefix.size());
            name+= fPrefix.indexOf(nextInt);

            nextInt = rand.nextInt(fPostfix.size());
            name+= fPostfix.indexOf(nextInt);

            name+= " ";

            nextInt = rand.nextInt(lPrefix.size());
            name+= lPrefix.indexOf(nextInt);

            nextInt = rand.nextInt(lPostfix.size());
            name+= lPostfix.indexOf(nextInt);

            results.add(name);
        }

        return results;
    }
    // Returns a random number between 1 and 20, which can be assigned to a stat from there.
    public int RandomizeStat() {
        Random rand = new Random(System.nanoTime());
        return rand.nextInt(19) + 1;
    }

    // Returns a random number between 1 and 3, which can be cross referenced with a gender chart for the result.
    public int RandomizeGender() {
        Random rand = new Random(System.nanoTime());
        return rand.nextInt(2) + 1;
    }
    // Returns a random number between 1 and 9, which can be cross referenced with a race chart for the result.
    public int RandomizeRace() {
        Random rand = new Random(System.nanoTime());
        return rand.nextInt(8) + 1;
    }
    // Returns a random number between 1 and 9, which can be cross referenced with a alignment chart for the result.
    public int RandomizeAlignment() {
        Random rand = new Random(System.nanoTime());
        return rand.nextInt(8) + 1;
    }
    // Returns a scaling HP based off of the CR (Combat Rating) of the NPC's statblock. Source: https://samhaine.wordpress.com/2020/12/28/dd-5e-adjusting-monster-hp/
    public int RandomizeHP(String cr) {
        Random rand = new Random(System.nanoTime());
        int hp = 0;
        switch(cr) {
            default:
                hp = 12;
                break;
            case "0":
                hp = rand.nextInt(5) + 1;
                break;
            case "1/8":
                hp = rand.nextInt(8) + 7;
                break;
            case "1/4":
                hp = rand.nextInt(33) + 16;
                break;
            case "1/2":
                hp = rand.nextInt(20) + 50;
                break;
            case "1":
                hp = rand.nextInt(14) + 71;
                break;
            case "2":
                hp = rand.nextInt(14) + 86;
                break;
            case "3":
                hp = rand.nextInt(14) + 101;
                break;
            case "4":
                hp = rand.nextInt(14) + 116;
                break;
            case "5":
                hp = rand.nextInt(14) + 131;
                break;
            case "6":
                hp = rand.nextInt(14) + 146;
                break;
            case "7":
                hp = rand.nextInt(14) + 161;
                break;
            case "8":
                hp = rand.nextInt(14) + 176;
                break;
            case "9":
                hp = rand.nextInt(14) + 191;
                break;
            case "10":
                hp = rand.nextInt(14) + 206;
                break;
            case "11":
                hp = rand.nextInt(14) + 221;
                break;
            case "12":
                hp = rand.nextInt(14) + 236;
                break;
            case "13":
                hp = rand.nextInt(14) + 251;
                break;
            case "14":
                hp = rand.nextInt(14) + 266;
                break;
            case "15":
                hp = rand.nextInt(14) + 281;
                break;
            case "16":
                hp = rand.nextInt(14) + 296;
                break;
            case "17":
                hp = rand.nextInt(14) + 311;
                break;
            case "18":
                hp = rand.nextInt(14) + 326;
                break;
            case "19":
                hp = rand.nextInt(14) + 341;
                break;
            case "20":
                hp = rand.nextInt(44) + 356;
                break;
        }
        return hp;
    }
}
