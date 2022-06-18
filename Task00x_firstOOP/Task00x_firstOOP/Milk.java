package Task00x_firstOOP;

public class Milk extends Drink {

    private Double fatContent;
    private String expirationDate;

    public Milk(String prodName, Double price, Integer quantity, String unitName, Double drinkVolume, Double fatContent, String expirationDate) {
        super(prodName, price, quantity, unitName, drinkVolume);
        this.fatContent = fatContent;
        this.expirationDate = expirationDate;
    }

    public Milk() {
        this("Товар Noname", 0.00, 0,"none", 0.00, 0.00,"NaN");
    }

    public String getInfo(){
        return super.getInfo() + String.format("Fat content: %.2f\nExpiration Date: %s\n", fatContent, expirationDate);            
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
