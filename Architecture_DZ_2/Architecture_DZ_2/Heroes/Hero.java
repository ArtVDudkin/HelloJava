package Architecture_DZ_2.Heroes;

import Architecture_DZ_2.Ammunition.Weapon;
import Architecture_DZ_2.Ammunition.Armor.Armor;

public abstract class Hero {
    
    private String name;
    private int health;
    private Weapon weapon;
    private Armor armor;

    public Hero(String name, int health, Weapon weapon, Armor armor) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.armor = armor;
    }

    public int attack(Hero enemy) {
        return enemy.getWeapon().getStrength();
    }

    public void getDamage(int damage) {
        this.health -= damage;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public Armor getArmor() {
        return this.armor;
    }
    
}
