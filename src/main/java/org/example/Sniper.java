package org.example;

public class Sniper extends GameCharacter{
    int capacity;
    int perk;
    int range;

    public Sniper(int id, String name, double health, int power, String weapon, int protection, int level, int capacity, int perk, int range) {
        super(id, name, health, power, weapon, protection, level);
        this.capacity = capacity;
        this.perk = perk;
        this.range = range;
    }
    @Override
    public String toString() {
        return (this.getClass().getName());
    }
}
