package Sem2.Fabric;

import Sem2.Interface.iGameItem;
import Sem2.Product.PlatinumReward;

public class PlatinumGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new PlatinumReward();
    }
}
