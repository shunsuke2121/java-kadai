package java7;

public class kadai84 {
    public static void main(String[] args) {
        ExamResult r1 = new ExamResult("Hikari",79);
        String kekka1 = r1.decide(80);
        System.out.println(kekka1);
        r1.changep(81);
        String kekka2 = r1.decide(80);
        System.out.println(kekka2);
        r1.changep(-10);
        String kekka3 = r1.decide(80);
        System.out.println(kekka3);
    }
}
