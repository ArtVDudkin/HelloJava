package Architecture_DZ_2.Heroes;

import Architecture_DZ_2.Ammunition.Weapon;
import Architecture_DZ_2.Ammunition.Armor.Armor;

public class Archer extends Hero {
    
    public Archer(String name, int health, Weapon weapon, Armor armor) {
        super(name, health, weapon, armor);
    }

    public void attack(Hero enemy) {
        System.out.println("Archer " + super.getName() + " attacks " + enemy.getName());
    }

}
