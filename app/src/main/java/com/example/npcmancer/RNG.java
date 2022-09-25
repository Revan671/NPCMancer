package com.example.npcmancer;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class RNG {

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
}
