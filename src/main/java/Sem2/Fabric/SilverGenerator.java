package Sem2.Fabric;


import Sem2.Interface.iGameItem;
import Sem2.Product.SilverReward;

public class SilverGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
