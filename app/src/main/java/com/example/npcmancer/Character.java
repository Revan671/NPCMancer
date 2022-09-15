package com.example.npcmancer;

// this class holds the variables for character information

public class Character {

    // character name
    private final String name;

    // character race
    private final String race;

    // character subRace for when it is applicable
    private final String subRace;

    // character age
    private final int age;

    // base character attributes
    // character strength attribute
    private final int str;

    // character dexterity attribute
    private final int dex;

    // character constitution attribute
    private final int con;

    // character wisdom attribute
    private final int wis;

    // character intelligence attribute
    private final int intel;

    // character charisma attribute
    private final int cha;

    // racial stat modifiers
    // strength modifier
    private final int strMod;

    // dexterity modifier
    private final int dexMod;

    // constitution modifier
    private final int conMod;

    //wisdom modifier
    private final int wisMod;

    // intelligence modifier
    private final int intelMod;

    // charisma modifier
    private final int chaMod;

    private Character(CharacterBuilder builder) {
        this.name = builder.name;
        this.race = builder.race;
        this.subRace = builder.subRace;
        this.age = builder.age;
        this.str = builder.str;
        this.dex = builder.dex;
        this.con = builder.con;
        this.wis = builder.wis;
        this.intel = builder.intel;
        this.cha = builder.cha;
        this.strMod = builder.strMod;
        this.dexMod = builder.dexMod;
        this.conMod = builder.conMod;
        this.wisMod = builder.wisMod;
        this.intelMod = builder.intelMod;
        this.chaMod = builder.chaMod;
    }

    // getters
    public String getName() {
        return name;
    }
    public String getRace() {
        return race;
    }
    public String getSubRace() {
        return subRace;
    }
    public int getAge() {
        return age;
    }
    public int getStr() {
        return str;
    }
    public int getDex() {
        return dex;
    }
    public int getCon() {
        return con;
    }
    public int getWis() {
        return wis;
    }
    public int getIntel() {
        return intel;
    }
    public int getCha() {
        return cha;
    }
    public int getStrMod() {
        return strMod;
    }
    public int getDexMod() {
        return dexMod;
    }
    public int getConMod() {
        return conMod;
    }
    public int getWisMod() {
        return wisMod;
    }
    public int getIntelMod() {
        return intelMod;
    }
    public int getChaMod() {
        return chaMod;
    }

    // builder class
    public static class CharacterBuilder {
        private final String name;
        private String race;
        private String subRace;
        private int age;
        private  int str;
        private  int dex;
        private int con;
        private int wis;
        private  int intel;
        private int cha;
        private int strMod;
        private int dexMod;
        private  int conMod;
        private  int wisMod;
        private int intelMod;
        private  int chaMod;

        // builder function to initialize character objects
        public CharacterBuilder(String name) {
            this.name = name;
        }
        public CharacterBuilder race(String race) {
            this.race = race;
            return this;
        }
        public CharacterBuilder subRace(String subRace) {
            this.subRace = subRace;
            return this;
        }
        public CharacterBuilder age(int age) {
            this.age = age;
            return this;
        }
        public CharacterBuilder str(int str) {
            this.str = str;
            return this;
        }
        public CharacterBuilder dex(int dex) {
            this.dex = dex;
            return this;
        }
        public CharacterBuilder con(int con) {
            this.con = con;
            return this;
        }
        public CharacterBuilder wis(int wis) {
            this.wis = wis;
            return this;
        }
        public CharacterBuilder intel(int intel) {
            this.intel = intel;
            return this;
        }
        public CharacterBuilder cha(int cha) {
            this.cha = cha;
            return this;
        }
        public CharacterBuilder strMod(int strMod) {
            this.strMod = strMod;
            return this;
        }
        public CharacterBuilder dexMod(int dexMod) {
            this.dexMod = dexMod;
            return this;
        }
        public CharacterBuilder conMod(int conMod) {
            this.conMod = conMod;
            return this;
        }
        public CharacterBuilder wisMod(int wisMod) {
            this.wisMod = wisMod;
            return this;
        }
        public CharacterBuilder intelMod(int intelMod) {
            this.intelMod = intelMod;
            return this;
        }
        public CharacterBuilder chaMod(int chaMod) {
            this.chaMod = chaMod;
            return this;
        }

        // Return the constructed Character object
        public Character build() {
            Character character = new Character(this);
            return character;
        }
    }
}
