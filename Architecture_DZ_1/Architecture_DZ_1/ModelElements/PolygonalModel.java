package Architecture_DZ_1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {
    
    private List<Polygon> polygons;
    private List<Texture> textures;

    public PolygonalModel() {
        polygons = new ArrayList<>();
        textures = new ArrayList<>();
    }

    public void addPolygon(Polygon poly) {
        polygons.add(poly);
    }

    public void removePolygon(Polygon poly) {
        polygons.remove(poly);
    }

    public void addTexture(Texture texture) {
        textures.add(texture);
    }

    public void removeTexture(Texture texture) {
        textures.remove(texture);
    }

    public List<Polygon> getPolygons() {
        return this.polygons;
    }

    public List<Texture> getTextures() {
        return this.textures;
    }

}
