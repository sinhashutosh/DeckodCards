package org.example;

public class DeckOFCard {
    public static void main(String[] args) {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        GetCard getCard = new GetCard();
        getCard.suffle(suit, rank);
    }
}
