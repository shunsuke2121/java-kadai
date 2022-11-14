package java6;

import javax.sound.sampled.Line;
import java.util.Random;
import java.util.Scanner;

public class kadai65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Target tA = new Target("A", 4, 4);
        Target tE = new Target("E", 1, 1);
        int gx = rand.nextInt(4);
        int gy = rand.nextInt(4);
        Target tG = new Target("G", gx, gy);
        while (true) {
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    if (x == tA.x && y == tA.y) {
                        System.out.print(tA.label);
                    } else if (x == tG.x && y == tG.y) {
                        System.out.print(tG.label);
                    } else if (x == tE.x && y == tE.y) {
                        System.out.print(tE.label);
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            System.out.println("移動どっち？");
            System.out.println(tE.x);
            System.out.println(tE.y);
            String key = input.next();
            tA.move(key);
            int bosu = rand.nextInt(4);
            switch (bosu) {
                case (0) -> tE.move("w");
                case (1) -> tE.move("a");
                case (2) -> tE.move("s");
                case (3) -> tE.move("d");
            }

            if (tA.x == tE.x && tA.y == tE.y) {
                System.out.println("You Lose...");
                System.exit(0);

            }
            if (tA.x == tG.x && tA.y == tG.y) {
                System.out.println("Goallll");
                System.exit(0);

            }

        }


    }
}
