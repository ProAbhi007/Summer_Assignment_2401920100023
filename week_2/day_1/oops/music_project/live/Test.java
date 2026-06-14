package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        System.out.println("=== Live Music Performance ===\n");

        // a. Create an instance of Veena and call play()
        System.out.println("--- a. Veena instance ---");
        Veena veena = new Veena();
        veena.play();

        System.out.println();

        // b. Create an instance of Saxophone and call play()
        System.out.println("--- b. Saxophone instance ---");
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        System.out.println();

        // c. Place instances in a Playable variable and call play()
        System.out.println("--- c. Using Playable reference (Polymorphism) ---");

        Playable p1 = new Veena();        
        Playable p2 = new Saxophone();    

        p1.play();   
        p2.play();  
    }
}