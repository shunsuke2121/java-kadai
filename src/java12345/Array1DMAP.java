package java12345;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Array1DMAP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ia = new int[5];
        int x = 2;
        while (true) {
            for (int i = 0; i < ia.length; i++) {
                if (i == x) {
                    ia[i] = 1;
                } else {
                    ia[i] = 0;
                }
                System.out.printf(ia[i] + "");
            }
            System.out.printf("どちらに移動する？:");
            String key = input.nextLine();
                switch (key) {
                    case "a":
                        x = x - 1;
                        System.out.printf("左に移動");
                        break;
                    case "d":
                        x=x+1;
                        System.out.printf("右に移動");
                        break;
                    case "q":
                        System.out.printf("終了");
                        System.exit(0);
                }
            if (x > 4 || x < 0) {
                System.out.printf("位置がだめ");
                switch (key){
                case "a":
                    x = x + 1;
                    break;
                case "d":
                    x=x-1;
                    break;
            }
            }


        }
    }
}
