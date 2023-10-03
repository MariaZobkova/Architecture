package Sem2.Fabric;

import Sem2.Interface.iGameItem;
import Sem2.Product.*;

public class GemGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new GemReward();
    }
}
