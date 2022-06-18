package Task00x_firstOOP;

public class Drink extends Product {

    private Double drinkVolume;

    public Drink(String prodName, Double price, Integer quantity, String unitName, Double drinkVolume) {
        super(prodName, price, quantity, unitName);
        this.drinkVolume = drinkVolume;  
    }

    public Drink() {
        this("Товар Noname", 0.00, 0,"none", 0.00);
    }

    public String getInfo(){
        return String.format("Drink volume: %.2f\n", drinkVolume);            
    }

    @Override
    public String toString(){
        return super.getInfo() + this.getInfo();
    }

}
