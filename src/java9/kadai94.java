package java9;

import java.util.Scanner;

public class kadai94 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("たて");
        float tate = input.nextFloat();
        System.out.println("yoko");
        float yoko = input.nextFloat();
        System.out.println("takasa");
        float takasa = input.nextFloat();
        Shikaku shikaku = new Shikaku(tate,yoko,takasa);
        Sankaku sankaku = new Sankaku(tate,yoko,takasa);
        shikaku.print();
        sankaku.print();
    }
}
