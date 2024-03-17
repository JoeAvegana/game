package org.example;

import java.util.Random;

public abstract class GameCharacter {
    protected static Random ran;
    protected int id;
    protected String name;
    protected double health;
    protected int power;
    protected String weapon;
    protected int protection;
    protected int level;

    static {
        GameCharacter.ran = new Random();
    }

    public GameCharacter(int id, String name,double health, int power, String weapon, int protection, int level) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.power = power;
        this.weapon = weapon;
        this.protection = protection;
        this.level = level;
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
        double damage = GameCharacter.ran.nextInt(1, 5)*power+level*0.2;
        target.getDamage(damage);
    }

    protected void death() {
        System.out.println("умер");
    }

    public double getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
