package Architecture_DZ_1.ModelElements;

public class Color {
    
    private Integer r;
    private Integer g;
    private Integer b;

    public Color(Integer r, Integer g, Integer b) {
        this.r = r;
        this.g = g;
        this.b = b; 
    }

    public Integer getRed() {
        return this.r;
    }

    public Integer getGreen() {
        return this.g;
    }

    public Integer getBlue() {
        return this.b;
    }

    public void setRed(Integer r) {
        this.r = r;
    }

    public void setGreen(Integer g) {
        this.g = g;
    }

    public void setBlue(Integer b) {
        this.b = b;
    }

}
