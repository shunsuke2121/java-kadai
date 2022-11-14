public class Triangle1 {
    float tate,yoko,takasa;
    Triangle1(float tate,float yoko,float takasa){
        this.tate=tate;
        this.yoko=yoko;
        this.takasa=takasa;
    }
    float menskei(){
        float ans = tate*yoko/2;
        return ans;
    }
    float taiseki(){
        float ans = tate*yoko*takasa/2;
        return ans;

    }
}
