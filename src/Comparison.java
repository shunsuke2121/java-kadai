public class Comparison {
    void  getMax(int a,int b){
        int x;
        if(a>=b){x=a;
        }
        else{x=b;}
        //int x = comp.getMax(a,b);
        //int y= comp.getMin(a,b);
        System.out.println("大きいのは"+x);
        //System.out.println("小さいのは"+x);

    }
    void getMin(int a,int b){
        int x;
        if(a<=b){x=a;
        }
        else{x=b;}
        //int x = comp.getMax(a,b);
        //int y= comp.getMin(a,b);
        //System.out.println("大きいのは"+x);
        System.out.println("小さいのは"+x);
    }
}