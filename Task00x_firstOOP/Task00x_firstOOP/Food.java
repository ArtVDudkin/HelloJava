package Task00x_firstOOP;

public class Food extends Product {

    private String expirationDate;

    public Food(String prodName, Double price, Integer quantity, String unitName, String expirationDate) {
        super(prodName, price, quantity, unitName);
        this.expirationDate = expirationDate;  
    }

    public Food() {
        this("Товар Noname", 0.00, 0,"none", "NaN");
    }

    public String getInfo(){
        return String.format("Expiration Date: %s\n", expirationDate);            
    }

    @Override
    public String toString(){
        return super.getInfo() + this.getInfo();
    }

}
