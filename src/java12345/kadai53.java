package java12345;

public class kadai53 {
    public static void main(String[] args) {
        MultiChecker mc1 = new MultiChecker();
        mc1.arg =3;
        MultiChecker mc2 =new MultiChecker();
        mc2.arg =5;
        short n=255;
        String ans1 = mc1.check(n);
        System.out.println(ans1);
        String ans2 = mc2.check(n);
        System.out.println(ans2);
    }
}
