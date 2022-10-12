package com.example.npcmancer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Race {
    // race Name
    private final String name;
    // list 1: First Name Prefixes
    private final List<String> fPrefix;
    // list 2: First Name Postfixes
    private final List<String> fPostfix;
    // list 3: Last Name Prefixes
    private final List<String> lPrefix;
    // list 4: Last Name Postfixes
    private final List<String> lPostfix;
    //constructor
    public Race(String name) {
        this.name = name;
        fPrefix = new ArrayList<String>();
        fPostfix = new ArrayList<String>();
        lPrefix = new ArrayList<String>();
        lPostfix = new ArrayList<String>();
    }
    //adds a prefix to either the first or last name prefix list, determined by the isFname boolean variable
    public void addPrefix(boolean isFname, String prefix) {
        if(isFname)
            fPrefix.add(prefix);
        else
            lPrefix.add(prefix);
    }
    //adds a postfix to either the first or last name postfix list, determined by the isFname boolean variable
    public void addPostfix(boolean isFname, String postfix) {
        if(isFname)
            fPostfix.add(postfix);
        else
            lPostfix.add(postfix);
    }

    //returns a list by its list number (written in the comments above)
    public List<String> getNameList(int list) {
        List<String> results = new ArrayList<String>();
        switch(list) {
            case 1:
                results = fPrefix;
                break;
            case 2:
                results = fPostfix;
                break;
            case 3:
                results = lPrefix;
                break;
            case 4:
                results = lPostfix;
                break;
        }
        return results;
    }

    private static void readFileToList(String fileName, List<String> List) throws IOException {

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = br.readLine()) != null) {
                List.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return;
    }

    public String getName() {
        return name;
    }
}
