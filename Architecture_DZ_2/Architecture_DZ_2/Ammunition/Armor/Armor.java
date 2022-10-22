package Architecture_DZ_2.Ammunition.Armor;

public abstract class Armor {
    
    private int defence;

    public int getRate() {
        return this.defence;
    }

    public void setDefence(int value) {
        this.defence = value;
    }
     
}
