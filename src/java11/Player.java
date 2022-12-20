package java11;

public class Player {
    private Card[] cards=new Card[2];
    public Player(Card card1,Card card2){
        this.cards[0]=card1;
        this.cards[1]=card2;
    }
    public int sum(){
        return cards[0].getNumber()+cards[1].getNumber();
    }
}
