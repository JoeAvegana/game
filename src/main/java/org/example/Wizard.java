package org.example;

public class Wizard extends GameCharacter{
    public Wizard(int id, String name, double health, int power, String weapon, int protection, int level) {
        super(id, name, health, power, weapon, protection, level);
    }
    @Override
    public String toString() {
        return (this.getClass().getName());
    }
}
