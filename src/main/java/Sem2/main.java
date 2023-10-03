package Sem2;

import Sem2.Fabric.*;
import Sem2.Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class main {

    public static void main(String[] args) {

        ItemGenerator f1 = new GoldGenerator();
        f1.OpenReward();
        ItemGenerator f2 = new GemGenerator();
        f2.OpenReward();
        ItemGenerator f3 = new SilverGenerator();
        f3.OpenReward();
        ItemGenerator f4 = new WoodGenerator();
        f4.OpenReward();
        ItemGenerator f5 = new SteelGenerator();
        f5.OpenReward();
        ItemGenerator f6 = new BronzeGenerator();
        f6.OpenReward();
        ItemGenerator f7 = new PlatinumGenerator();
        f7.OpenReward();
        ItemGenerator f8 = new RockGenerator();
        f8.OpenReward();

        System.out.println("_____________________________");


        List<ItemGenerator> prizeGenerator = new ArrayList<ItemGenerator>();
        prizeGenerator.add(f1);
        prizeGenerator.add(f2);
        prizeGenerator.add(f3);
        prizeGenerator.add(f4);
        prizeGenerator.add(f5);
        prizeGenerator.add(f6);
        prizeGenerator.add(f7);
        prizeGenerator.add(f8);


        Random rnd = ThreadLocalRandom.current();
        int countGold = 0;
        int countGem = 0;


        for (int i = 0; i < 20; i++) {
            int index = rnd.nextInt(8);

            if (index == 0){
                countGold++;
                index = rnd.nextInt(2,8);
                prizeGenerator.get(index).OpenReward();
            }
            else if (index == 1){
                countGem++;
                index = rnd.nextInt(2,8);
                prizeGenerator.get(index).OpenReward();
            }
            else if (countGold == 11 || i%11 == 0 && i!=0 || i%12 == 0 && i!=0|| i%13 == 0 && i!=0){
                prizeGenerator.get(0).OpenReward();
                countGold = 0;
            }
            else if (countGem ==  13 || i%14 == 0 && i!=0 ) {
                prizeGenerator.get(1).OpenReward();
                countGem = 0;
            }
            else if (index != 1 && index != 0){
                prizeGenerator.get(index).OpenReward();
            }


        }
    }
}
