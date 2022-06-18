package Task00x_firstOOP;

public class BabysProd extends Product {

    private Integer ageFrom;
    private String hypoallergenic;

    public BabysProd(String prodName, Double price, Integer quantity, String unitName, Integer ageFrom, String hypoallergenic) {
        super(prodName, price, quantity, unitName);
        this.ageFrom = ageFrom;
        this.hypoallergenic = hypoallergenic;  
    }

    public BabysProd() {
        this("Товар Noname", 0.00, 0,"none", 0, "None");
    }

    public String getInfo(){
        return String.format("Minimum age: %d\nHypoallergenic: %s\n", ageFrom, hypoallergenic);            
    }

    @Override
    public String toString(){
        return super.getInfo() + this.getInfo();
    }

}
