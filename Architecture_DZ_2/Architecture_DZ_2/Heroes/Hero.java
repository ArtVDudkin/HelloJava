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

    public void attack(Hero hero) {};

    public Integer getDamage(Weapon weapon) {
        return null;
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
    
}
