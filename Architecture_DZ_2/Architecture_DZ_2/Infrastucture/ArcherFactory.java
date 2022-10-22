package Architecture_DZ_2.Infrastucture;

import Architecture_DZ_2.Ammunition.Armor.Armor;
import Architecture_DZ_2.Ammunition.Bows.Bow;
import Architecture_DZ_2.Heroes.Archer;

public class ArcherFactory implements IHeroFactory {

    private static ArcherFactory instance;
    private int health = 100;

    private ArcherFactory() {};

    public static ArcherFactory getFactory() {
        if (instance == null) {
            return new ArcherFactory();
        }
        return instance;
    }

    @Override
    public Archer createHero(String name, String weaponType, String armorType) {
        return new Archer(name, this.health, makeWeapon(weaponType), makeArmor(armorType));
    }

    private Bow makeWeapon(String weaponType) {
        return BowFactory.getFactory().createWeapon(weaponType);
    }

    private Armor makeArmor(String armorType) {
        return ChainmailFactory.getFactory().createArmor(armorType);
    }
    
}
