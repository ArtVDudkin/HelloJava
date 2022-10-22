package Architecture_DZ_2.Infrastucture;

import Architecture_DZ_2.Ammunition.Armor.Armor;
import Architecture_DZ_2.Ammunition.Swords.Sword;
import Architecture_DZ_2.Heroes.Knight;

public class KnightFactory implements IHeroFactory {

    private static KnightFactory instance;
    private int health = 100;

    private KnightFactory(){};

    public static KnightFactory getFactory(){
        if (instance == null) {
            return new KnightFactory();
        }
        return instance;
    }

    @Override
    public Knight createHero(String name,  String weaponType, String armorType) {
        return new Knight(name, this.health, makeWeapon(weaponType), makeArmor(armorType));
    }

    private Armor makeArmor(String armorType){
        return LatsFactory.getFactory().createArmor(armorType);
    }

    private Sword makeWeapon(String weaponType){
        return SwordFactory.getFactory().createWeapon(weaponType);
    }
    
}
