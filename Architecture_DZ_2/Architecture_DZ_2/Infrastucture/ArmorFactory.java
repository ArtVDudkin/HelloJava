package Architecture_DZ_2.Infrastucture;

import Architecture_DZ_2.Ammunition.Armor.Armor;

public abstract class ArmorFactory {
    
    public abstract Armor createArmor(String armorType);
    
}
