package InMemoryModel;
import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changeObservers;

    public ModelStore(IModelChangedObserver[] changeObservers) {
        this.changeObservers = changeObservers;
        this.scenes = new ArrayList<>();
        this.models = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        scenes.add(new Scene(new ArrayList<PoligonalModel>(), new ArrayList<Flash>(), new ArrayList<Camera>()));
        models.add(new PoligonalModel(new ArrayList<Texture>()));
        flashes.add(new Flash());
        cameras.add(new Camera());


    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
    public Scene getScena (Integer id){
        return null;
    }
}
