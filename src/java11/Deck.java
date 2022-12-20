package java11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SplittableRandom;

public class Deck {
    private ArrayList<Card>cardList;

    public Deck(){
        String[] marks= new String[]{"ダイヤ","スペード","ハート","クローバー"};
        ArrayList<Card>cardList = new ArrayList<>();
        for (int i = 0;i<marks.length;i++){
            String mark = marks[i];
            for (int j=1;j<=13;j++){
                Card card = new Card(mark,j);
                cardList.add(card);
                System.out.println(j+mark);
            }
        }
        Collections.shuffle(cardList);
        this.cardList = cardList;
    }

    public Card Draw(int i) {
        Card c = cardList.get(i);
        cardList.remove(i);
        return c;
    }

    public void printCardList(){
        for (int i = 0;i< cardList.size();i++){
            Card card = cardList.get(i);
            card.print();
        }
        System.out.println(cardList.size());
    }
    public int decksize(){
        return cardList.size();
    }



}
