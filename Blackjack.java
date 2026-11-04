// Blackjack.java
// Vibu Ramineni
// 10/28/2026

public class Blackjack
{
    private String[] suits = {"hearts", "diamonds", "spades", "clubs"};
    private String[] values = {"A0", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A1"};
    private int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

    private Deck deck = new Deck(suits, values, points);

    public Blackjack(int numPlayers)
    {
        Card[] storage = deck.getDeckOfCards();

        for (int i = 0; i < storage.length; i++)
        {
            System.out.println(deck.getSuit(i) + "\n" + deck.getValue(i) + "\n" + deck.getPoint(i));
        }
    }
}
