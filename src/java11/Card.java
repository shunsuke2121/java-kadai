package java11;

public class Card {
    private String mark;
    private int number;

    public Card(String mark,int number){
        this.mark = mark;
        this.number = number;
    }
    public void print(){
        System.out.println(mark + "の" + number);
    }

    public String getMark() {
        return mark;
    }

    public int getNumber() {
        return number;
    }
}

