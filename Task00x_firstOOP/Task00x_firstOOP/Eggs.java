package Task00x_firstOOP;

public class Eggs extends Food {

    private Integer qtyInPackage;

    public Eggs(String prodName, Double price, Integer quantity, String unitName, String expirationDate, Integer qtyInPackage) {
        super(prodName, price, quantity, unitName, expirationDate);
        this.qtyInPackage = qtyInPackage;  
    }

    public Eggs() {
        this("Товар Noname", 0.00, 0,"none", "NaN", 0);
    }

    public String getInfo(){
        return super.getInfo() + String.format("Quantity in package: %d\n", qtyInPackage);            
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
