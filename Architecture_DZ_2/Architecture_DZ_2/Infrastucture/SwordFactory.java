package Architecture_DZ_2.Infrastucture;

import Architecture_DZ_2.Ammunition.Swords.GoodSword;
import Architecture_DZ_2.Ammunition.Swords.SimpleSword;
import Architecture_DZ_2.Ammunition.Swords.Sword;

public class SwordFactory extends WeaponFactory {
    private static SwordFactory instance;

    private SwordFactory(){};

    public static SwordFactory getFactory(){
        if (instance == null) {
            return new SwordFactory();
        }
        return instance;
    }

    @Override
    public Sword createWeapon(String weaponType) {        
        switch (weaponType) {
            case "SimpleSword":
                return new SimpleSword();
            case "GoodSword":
                return new GoodSword();
            default:
                throw new RuntimeException("Invalid weapon type");
        }
    }

}
