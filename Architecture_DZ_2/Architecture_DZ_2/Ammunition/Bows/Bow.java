package Architecture_DZ_2.Ammunition.Bows;

import Architecture_DZ_2.Ammunition.Weapon;

public abstract class Bow  extends Weapon {
    
    private int range;
    private int strength;

    public int getRange() {
        return this.range;
    }

    public int getStrength() {
        return this.strength;
    }
    
    public void setRange(int value) {
        this.range = value;
    }

    public void setStrength(int value) {
        this.strength = value;
    }

}
