package java9;

import java.util.Random;

public class OmikujiBox {
    Omikuji[] omikuji = new Omikuji[5];
    public OmikujiBox() {
    omikuji[0]=new Omikuji("大吉","今日は絶好調");
    omikuji[1]=new Omikuji("吉" ,"うれしいことがあるかも");
    omikuji[2]=new Omikuji("中吉","忘れ物に注意");
    omikuji[3]=new Omikuji("小吉","寝坊に注意");
    omikuji[4]=new Omikuji("凶","殺す");
    }
    public void pickup(){
        Random rand = new Random();
        int n= rand.nextInt(5);
        omikuji[n].print();
    }
}
