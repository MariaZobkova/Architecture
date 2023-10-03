package Sem2.Fabric;


import Sem2.Interface.iGameItem;

public abstract class ItemGenerator {

    public abstract iGameItem createItem();

    public void OpenReward(){
        createItem().open();
    }
}
