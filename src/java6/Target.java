package java6;

import java.util.Objects;

public class Target {
    String label;
    int x,y;
    Target(String label,int x,int y){
        this.label = label;
        this.x=x;
        this.y=y;
    }
    void hidari(){
        if(x>0){
            x= (x-1);
        }
    }
    void migi(){
        if(x<4){
            x= (x+1);
        }
    }
    void ue(){
        if(y>0){
            y=(y-1);
        }
    }
    void shita(){
        if(y<4){
            y=(y+1);
        }
    }
    void move(String move){
        if(Objects.equals(move, "w")){
            ue();
        }
        if(Objects.equals(move, "a")){
            hidari();
        }
        if(Objects.equals(move, "s")){
            shita();
        }
        if(Objects.equals(move, "d")){
            migi();
        }
    }
}
