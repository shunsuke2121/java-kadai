import java.util.Scanner;

public class kadai55 {
    public static void main(String[] args) {
         var input = new Scanner(System.in);
        System.out.print("x=");
        float x = input.nextInt();
        System.out.print("y=");
        float y = input.nextInt();
        var s = new Square();
        s.tate=x;
        s.yoko =y;
        float sm = s.menseki();
        var t = new Triangle();
        t.tate=x;
        t.yoko=y;
        float tm = t.menskei();
        System.out.println(sm);
        System.out.println(tm);
    }
}
