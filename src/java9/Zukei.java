package java9;

import org.w3c.dom.ls.LSOutput;

public class Zukei {
    protected float tate;
    protected float yoko;
    protected float takasa;
    protected float calcMrnseki(){
        return 0.0f;
    }
    protected float calcTaiseki(){
        return calcMrnseki()*takasa;
    }

    public void print(){
    float ans1 = calcMrnseki();
    float ans2 = calcTaiseki();
        System.out.println("面積:"+ans1);
        System.out.println("体積:"+ans2);
    }
}
