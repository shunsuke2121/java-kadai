package java7;

public class Circle {
    private float r;
    public Circle(){
        r = 1;
    }
    public void ensyu (){
        System.out.println(r*2.0*3.14);
    }
    public void menseki(){
        System.out.println(r*r*3.14);
    }

    public void setR(float r) {
        if(r>0){this.r = r;}
        else {
            this.r = 1;
        }
    }
}
