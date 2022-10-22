package Architecture_DZ_2.Heroes;

import Architecture_DZ_2.Ammunition.Weapon;
import Architecture_DZ_2.Ammunition.Armor.Armor;

public class Knight extends Hero {
    
    public Knight(String name, int health, Weapon weapon, Armor armor) {
        super(name, health, weapon, armor);
    }

    @Override
    public int attack(Hero enemy) {
        if(enemy.getHealth() <= 0) {
            System.out.println(enemy.getName() + " is dead! You can not attack him");
            return 0;
        } else {
            int damage = enemy.getHealth() - super.getWeapon().getStrength() * enemy.getArmor().getRate() / 100;
            enemy.getDamage(damage);
            System.out.println("Knight " + super.getName() + " attacks " + enemy.getName() + " and takes damage "+ damage);
            if(enemy.getHealth() <= 0) {
                System.out.println(enemy.getName() + " killed by " + this. getName());
            } else {
                System.out.println(enemy.getName() + " health = " + enemy.getHealth());
            }
            return enemy.getHealth() - super.getWeapon().getStrength() * enemy.getArmor().getRate() / 100;
        }
    }
}
