import java.sql.SQLOutput;
import java.util.Scanner;
public class kadai44 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("a=");
        int a = input.nextInt();
        System.out.println("b=");
        int b = input.nextInt();
        Comparison comp = new Comparison();
        comp.getMax(a,b);
        comp.getMin(a,b);
        //System.out.println("大きいのは"+x);
        //System.out.println("小さいのは");
    }
}
