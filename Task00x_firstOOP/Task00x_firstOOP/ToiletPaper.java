package Task00x_firstOOP;

public class ToiletPaper extends HygieneSup {

    private Integer cntLayers;

    public ToiletPaper(String prodName, Double price, Integer quantity, String unitName, Integer qtyInPackage, Integer cntLayers) {
        super(prodName, price, quantity, unitName, qtyInPackage);
        this.cntLayers = cntLayers;  
    }

    public ToiletPaper() {
        this("Товар Noname", 0.00, 0,"none", 0, 0);
    }

    public String getInfo(){
        return super.getInfo() + String.format("Quantity of Layers: %d\n", cntLayers);            
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
