package Architecture_DZ_2.Ammunition.Bows;

public class SimpleBow extends Bow {

    private int range = 10;
    private int strength = 10;
    
    public SimpleBow() {
        super.setRange(this.range);
        super.setStrength(this.strength);
    }

}
