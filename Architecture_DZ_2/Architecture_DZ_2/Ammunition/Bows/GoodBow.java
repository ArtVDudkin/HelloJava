package Architecture_DZ_2.Ammunition.Bows;

public class GoodBow extends Bow {
    
    private int range = 20;
    private int strength = 20;

    public GoodBow() {
        super.setRange(this.range);
        super.setStrength(this.strength);
    }
}
