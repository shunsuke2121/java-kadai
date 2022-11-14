package java12345;

import java.util.Scanner;

public class kadai56 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("x=");
        float x = input.nextInt();
        System.out.print("y=");
        float y = input.nextInt();
        System.out.print("z=");
        float z = input.nextInt();
        var s = new Square();
        s.tate=x;
        s.yoko =y;
        s.takasa =z;
        float sm = s.menseki();
        float st = s.taiseki();
        var t = new Triangle();
        t.tate=x;
        t.yoko=y;
        t.takasa=z;
        float tm = t.menskei();
        float tt = t.taiseki();
        System.out.println("4角形の面積は"+sm+"体積は"+st);
        System.out.println("3角形の面積は"+tm+"体積は"+tt);

    }
}
