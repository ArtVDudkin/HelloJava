package Task00x_firstOOP;

public class HygieneSup extends Product {

    private Integer qtyInPackage;

    public HygieneSup(String prodName, Double price, Integer quantity, String unitName, Integer qtyInPackage) {
        super(prodName, price, quantity, unitName);
        this.qtyInPackage = qtyInPackage;  
    }

    public HygieneSup() {
        this("Товар Noname", 0.00, 0,"none", 0);
    }

    public String getInfo(){
        return String.format("Quantity in package: %d\n", qtyInPackage);            
    }

    @Override
    public String toString(){
        return super.getInfo() + this.getInfo();
    }

}
