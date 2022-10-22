package Architecture_DZ_2.Infrastucture;

import Architecture_DZ_2.Ammunition.Weapon;

public abstract class WeaponFactory {
    
    public abstract Weapon createWeapon(String weaponType);
    
}
