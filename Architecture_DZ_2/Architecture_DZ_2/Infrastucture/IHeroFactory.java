package Architecture_DZ_2.Infrastucture;

import Architecture_DZ_2.Heroes.Hero;

public interface IHeroFactory <T extends Hero>{

    public T createHero(String name, String weapon, String armor);

}
