package Task00x_firstOOP;

public class Bread extends Food {

    private String flourType;

    public Bread(String prodName, Double price, Integer quantity, String unitName, String expirationDate, String flourType) {
        super(prodName, price, quantity, unitName, expirationDate);
        this.flourType = flourType;  
    }

    public Bread() {
        this("Товар Noname", 0.00, 0,"none", "NaN", "none");
    }

    public String getInfo(){
        return super.getInfo() + String.format("Flour type: %s\n", flourType);            
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
