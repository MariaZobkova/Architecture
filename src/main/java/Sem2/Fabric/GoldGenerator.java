package Sem2.Fabric;


import Sem2.Product.GoldReward;
import Sem2.Interface.iGameItem;

public class GoldGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
