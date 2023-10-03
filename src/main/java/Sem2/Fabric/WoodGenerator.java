package Sem2.Fabric;



import Sem2.Interface.iGameItem;
import Sem2.Product.WoodReward;

public class WoodGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new WoodReward();
    }
}
