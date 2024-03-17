package org.example;

public class Archer extends GameCharacter {
    int capacity;
    int perk;
    int range;

    public Archer(int id, String name, double health, double power, String weapon, int protection, int capacity, int perk, int range) {
        super(id, name, health, power, weapon, protection);
        this.capacity = capacity;
        this.perk = perk;
        this.range = range;
    }


}
