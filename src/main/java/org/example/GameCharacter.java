package org.example;

import java.util.Random;

public abstract class GameCharacter {
    protected static Random ran;
    protected int id;
    protected String name;
    protected double health;
    protected double power;
    protected String weapon;
    protected int protection;

    static {
        GameCharacter.ran = new Random();
    }

    public GameCharacter(int id, String name,double health, double power, String weapon, int protection) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.power = power;
        this.weapon = weapon;
        this.protection = protection;
    }

    protected void stats() {
        System.out.println("Id:" + id + "\n"
                + " Name" + name + "\n"
                + " Health:" + health + "\n"
                + "Power:" + power + "\n"
                + " Weapon:" + weapon);
    }

    protected void getDamage(double damage) {
        if (this.health - damage > 0) {
            this.health = this.health - damage-protection*0.1;
        }
    }

    protected void attack(GameCharacter target) {
       int damage = GameCharacter.ran.nextInt(1, 5);
    }

    protected void death() {
        System.out.println("умер");
    }

    public double getHealth() {
        return health;
    }
}
