package Architecture_DZ_2.Infrastucture;

import Architecture_DZ_2.Ammunition.Bows.Bow;
import Architecture_DZ_2.Ammunition.Bows.GoodBow;
import Architecture_DZ_2.Ammunition.Bows.SimpleBow;

public class BowFactory extends WeaponFactory {

    private static BowFactory instance;

    private BowFactory(){};

    public static BowFactory getFactory(){
        if (instance == null) {
            return new BowFactory();
        }
        return instance;
    }

    @Override
    public Bow createWeapon(String weaponType) {        
        switch (weaponType) {
            case "SimpleBow":
                return new SimpleBow();
            case "GoodBow":
                return new GoodBow();
            default:
                throw new RuntimeException("Invalid weapon type");
        }
    }
    
}
