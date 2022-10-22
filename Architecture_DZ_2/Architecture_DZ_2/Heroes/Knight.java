package Architecture_DZ_2.Heroes;

import Architecture_DZ_2.Ammunition.Weapon;
import Architecture_DZ_2.Ammunition.Armor.Armor;

public class Knight extends Hero {
    
    public Knight(String name, int health, Weapon weapon, Armor armor) {
        super(name, health, weapon, armor);
    }

    public void attack(Hero enemy) {
        System.out.println("Knight " + super.getName() + " attacks " + enemy.getName());
    }
}
