package java12345;

import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a :");
        Float a = input.nextFloat();
        System.out.print("b :");
        Float b = input.nextFloat();

        float ans = a + b;
        System.out.println("a+b " + ans);
    }
}