package Sem2.Fabric;


import Sem2.Interface.iGameItem;
import Sem2.Product.SteelReward;

public class SteelGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new SteelReward();
    }
}
