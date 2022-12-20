package java11;

public class judge {
    private int Sum1;
    private int Sum2;

    public judge(int sum, int sum1) {
        this.Sum1 = sum;
        this.Sum2 = sum1;
    }
    public void print(){
        System.out.println(JUDGE());
        System.out.println("human:"+Sum1+"\n"+"cpu:"+Sum2);
    }

    public String JUDGE() {
        if (Sum1 > 21) {
            Sum1 = -10;
        }
        if (Sum2 > 21) {
            Sum2 = -10;
        }
        if (Sum1 > Sum2 && Sum1 >= 0) {
            return "humanの勝ち";
        }
        if (Sum1 < Sum2  && Sum2 > 0 ) {
            return "cpuの勝ち";
        }
        else {
            return "引き分け";
        }
    }
}
