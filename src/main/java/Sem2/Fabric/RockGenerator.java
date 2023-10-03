package Sem2.Fabric;


import Sem2.Interface.iGameItem;
import Sem2.Product.RockReward;

public class RockGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new RockReward();
    }
}
