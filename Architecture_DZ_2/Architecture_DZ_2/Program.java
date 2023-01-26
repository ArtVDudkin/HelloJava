package Architecture_DZ_2;

import Architecture_DZ_2.Heroes.Hero;
import Architecture_DZ_2.Infrastucture.ArcherFactory;
import Architecture_DZ_2.Infrastucture.KnightFactory;

public class Program {
    
    public static void main(String[] args) {
        
        ArcherFactory archFactory = ArcherFactory.getFactory();
        KnightFactory knightFactory = KnightFactory.getFactory();
        Hero archer1 = archFactory.createHero("Ronald", "SimpleBow", "ChainmailLevel1");
        Hero archer2 = archFactory.createHero("Gerald", "GoodBow", "ChainmailLevel2");
        Hero knight1 = knightFactory.createHero("Richard", "SimpleSword", "LatsLevel1");
        Hero knight2 = knightFactory.createHero("Alex", "GoodSword", "LatsLevel2");

        System.out.println("-------Game start-------");
        archer1.attack(knight1);
        knight2.attack(archer2);

    }

}
