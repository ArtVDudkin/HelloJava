package Architecture_DZ_2.Ammunition.Swords;

import Architecture_DZ_2.Ammunition.Weapon;

public abstract class Sword extends Weapon {
    
    private int strength;

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int value) {
        this.strength = value;
    }
}
