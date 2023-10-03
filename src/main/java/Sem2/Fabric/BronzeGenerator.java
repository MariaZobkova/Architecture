package Sem2.Fabric;

import Sem2.Interface.iGameItem;
import Sem2.Product.BronzeReward;

public class BronzeGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new BronzeReward();
    }
}
