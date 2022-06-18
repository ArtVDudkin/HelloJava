package Task00x_firstOOP;

/**
 * Класс Товар
 */
public class Product {
    
    private String prodName;
    private Double price;
    private Integer quantity;
    private String unitName;
    
    
    /**
     * Создаём товар
     * @param prodName - название
     * @param price - цена
     * @param quantity - количество
     * @param unitName - единица измерения
     */
    public Product(String prodName, Double price, Integer quantity, String unitName) {
        this.prodName = prodName;
        this.price = price;
        this.quantity = quantity;
        this.unitName = unitName;
    }
    
    public Product() {
        this("Noname", 0.00, 0,"none");
    }

    public String getInfo(){
        return String.format("%s\nPrice: %.2f\nQuantity: %d %s\n",this.prodName, this.price, this.quantity, this.unitName);            
    }

    @Override
    public String toString(){
        return this.getInfo();
    }
}