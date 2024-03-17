package org.example;

public class Peasant extends GameCharacter{

    int stamina;
    public Peasant(int id, String name, double health, int power, String weapon, int stamina, int protection, int level) {
        super(id, name, health, power, weapon, protection, level);
        this.stamina=stamina;
    }
    @Override
    public String toString() {
        return (this.getClass().getName());
    }
}
