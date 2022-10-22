package Architecture_DZ_2.Infrastucture;

import Architecture_DZ_2.Ammunition.Armor.Armor;
import Architecture_DZ_2.Ammunition.Armor.LatsLevel1;
import Architecture_DZ_2.Ammunition.Armor.LatsLevel2;

public class LatsFactory extends ArmorFactory {

    private static LatsFactory instance;

    private LatsFactory(){};

    public static LatsFactory getFactory(){
        if (instance == null) {
            return new LatsFactory();
        }
        return instance;
    }

    @Override
    public Armor createArmor(String armorType) {
        switch (armorType) {
            case "LatsLevel1":
                return new LatsLevel1();
            case "LatsLevel2":
                return new LatsLevel2();
            default:
                throw new RuntimeException("Invalid armor type");
        }
    }
    
}
