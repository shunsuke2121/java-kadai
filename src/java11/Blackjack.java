package java11;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Random random = new Random();
        Scanner input= new Scanner(System.in);
        Player human = new Player(deck.Draw(input.nextInt()),deck.Draw(input.nextInt()));
        Player cpu = new Player(deck.Draw(random.nextInt(deck.decksize())),deck.Draw(random.nextInt(deck.decksize())));
        judge judges = new judge(human.sum(),cpu.sum());
        judges.print();
    }

}
