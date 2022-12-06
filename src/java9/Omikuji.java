package java9;

public class Omikuji {
    protected String luck;
    protected String setumei;
    public Omikuji(String luck,String setumei){
        this.luck = luck;
        this.setumei = setumei;
    }
    public void print(){
        String str  = "今日の運勢 :"+luck+","+setumei;
        System.out.println(str);
    }
}
