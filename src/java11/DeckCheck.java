package java11;

import java.util.Scanner;

public class DeckCheck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printCardList();
        Scanner input = new Scanner(System.in);
        try {
            Card card = deck.Draw(input.nextInt());
            card.print();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("範囲外です");
        }

    }
}
