package java7;

public class ExamResult {
    private String name;
    private int point;

    public ExamResult(String name, int point) {
        this.name = name;
        if (point <= 100 && point >= 0) {
            this.point = point;
        }
        this.point = 0;
    }

    public String decide(int border) {
        if (border < point) {
            return "合格";
        }
        return "不合格";
    }

    public void changep(int point2) {
        if (point2 <= 100 && point2 >= 0) {
            point = point2;
        } else {
            point = 0;
        }
    }
}
