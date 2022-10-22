package Architecture_DZ_2.Infrastucture;

import Architecture_DZ_2.Ammunition.Armor.Armor;
import Architecture_DZ_2.Ammunition.Armor.ChainmailLevel1;
import Architecture_DZ_2.Ammunition.Armor.ChainmailLevel2;

public class ChainmailFactory extends ArmorFactory {

    private static ChainmailFactory instance;

    private ChainmailFactory(){};

    public static ChainmailFactory getFactory() {
        if (instance == null) {
            return new ChainmailFactory();
        }
        return instance;
    }

    @Override
    public Armor createArmor(String armorType) {
        switch (armorType) {
            case "ChainmailLevel1":
                return new ChainmailLevel1();
            case "ChainmailLevel2":
                return new ChainmailLevel2();
            default:
                throw new RuntimeException("Invalid armor type");
        }
    }

}
