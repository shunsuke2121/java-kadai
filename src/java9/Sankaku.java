package java9;

public class Sankaku extends Zukei{
    Sankaku(float tate,float yoko,float takasa){
        this.tate=tate;
        this.yoko=yoko;
        this.takasa = takasa;
    }

    @Override
    protected float calcMrnseki() {
        float ans = tate * yoko/2;
        return ans;
    }
}
