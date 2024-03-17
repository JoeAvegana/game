package org.example;

public class Peasant extends GameCharacter{
    int level;
    int stamina;
    public Peasant(int id, String name, double health, double power, String weapon, int agility, int stamina, int protection) {
        super(id, name, health, power, weapon, protection);
        this.level=1;
        this.stamina=stamina;
    }

    @Override
    protected void attack(GameCharacter target) {
        double damage = GameCharacter.ran.nextInt(1, 5)*power+level*0.2;
        target.getDamage(damage);
    }

}
