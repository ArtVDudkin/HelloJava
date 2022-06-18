package Task00x_firstOOP;

public class Diaper extends HygieneSup {

    private Integer diaperSize;
    private Double minWeight;
    private Double maxWeight;
    private String diaperType;

    public Diaper(String prodName, Double price, Integer quantity, String unitName, Integer qtyInPackage, 
                    Integer diaperSize, Double minWeight, Double maxWeight, String diaperType) {
        super(prodName, price, quantity, unitName, qtyInPackage);
        this.diaperSize = diaperSize;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.diaperType = diaperType;
    }

    public Diaper() {
        this("Товар Noname", 0.00, 0,"none", 0, 0, 0.00, 0.00, "none");
    }

    public String getInfo(){
        return super.getInfo() + String.format("Size: %d\nMin weight: %.2f\nMax weight: %.2f\nDiaper type: %s\n", diaperSize, minWeight, maxWeight, diaperType);            
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
