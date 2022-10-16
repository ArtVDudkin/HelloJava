package Architecture_DZ_1.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import Architecture_DZ_1.ModelElements.Camera;
import Architecture_DZ_1.ModelElements.Flash;
import Architecture_DZ_1.ModelElements.PolygonalModel;
import Architecture_DZ_1.ModelElements.Scene;

public class ModelStore implements IModelChanger {
    
    private List<Scene> scenes;
    private List<PolygonalModel> models;
    private List<Flash> flashes;
    private List<Camera> cameras;
    private IModelChangedObserver changedObserver;

    public ModelStore() {
        scenes = new ArrayList<>();
        models = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();
    }

    public Scene getScene(Integer index) {
        if(index >= 0 && index < scenes.size()) {
            return scenes.get(index);    
        } else {
            throw new RuntimeException("Error: there is no scene at index " + index);
        }
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        System.out.println(sender);
    }

}
