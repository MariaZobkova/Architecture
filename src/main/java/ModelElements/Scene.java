package ModelElements;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Scene {
    public Integer id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List <Camera> cameras;

    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;

        models.add(new PoligonalModel(new ArrayList<Texture>()));
        cameras.add(new Camera());

    }
    public Type method1(Type type){
        return null;
    }
    public Type method2(Type type, Type type2){
        return null;
    }
}

