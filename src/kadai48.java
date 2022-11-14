import java.sql.SQLOutput;
import java.util.Scanner;
public class kadai48 {
    public static void main(String[] args) {
        Hantei hantei = new Hantei();
        Scanner input =new Scanner(System.in);
        System.out.println("a=");
        int a = input.nextInt();
        String x = hantei.even(a);
        System.out.println(a+"は"+x);
    }
}
