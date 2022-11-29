package java7;

import java.util.Scanner;

public class kadai87 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i<3;i++){
            System.out.print("r=");
            float r = input.nextFloat();
            c.setR(r);
            c.ensyu();
            c.menseki();
        }
    }
}
