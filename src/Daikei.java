public class Daikei {
    float t,b,h;
    Daikei(float t,float b,float h){
        this.t=t;
        this.b=b;
        this.h=h;
    }
    float menseki(){
        return (t+b)*h/2;
    }
    void print(){
        float a =menseki();
        System.out.println("上底:"+t);
        System.out.println("下底:"+b);
        System.out.println("高さ:"+h);
        System.out.println("面積:"+a);

    }
}
