package live;

import compartment.Compartment;
import compartment.FirstClass;
import compartment.Ladies;
import compartment.General;
import compartment.Luggage;
import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] train = new Compartment[10];
        Random rand = new Random();

        System.out.println("=== Train Compartment Assignment ===\n");

        for (int i = 0; i < train.length; i++) {
            int type = rand.nextInt(4) + 1;
            switch (type) {
                case 1: train[i] = new FirstClass(); break;
                case 2: train[i] = new Ladies();     break;
                case 3: train[i] = new General();    break;
                case 4: train[i] = new Luggage();    break;
            }
            System.out.println("Compartment " + (i + 1) + ": " + train[i].notice());
        }
    }
}