package java9;

public class Shikaku extends Zukei{
    public Shikaku(float tate,float yoko,float takasa){
        this.tate = tate;
        this.yoko = yoko;
        this.takasa = takasa;
    }

    @Override
    protected float calcMrnseki(){
        float ans = tate*yoko;
        return ans;
    }
}
