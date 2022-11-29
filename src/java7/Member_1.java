package java7;

public class Member_1 {
    private String gakuseki;
    private  String shimei;
    public Member_1(String gakuseki, String shimei){
        this.gakuseki=gakuseki;
        this.shimei=shimei;
    }

    public void change(){
        gakuseki=null;
        shimei=null;
    }
    public String getGakuseki() {
        return gakuseki;
    }

    public void setGakuseki(String gakuseki) {
        this.gakuseki = gakuseki;
    }

    public void setShimei(String shimei) {
        this.shimei = shimei;
    }

    public String getShimei() {
        return shimei;
    }

    public void print() {
        System.out.println(gakuseki+","+shimei);
    }
}
