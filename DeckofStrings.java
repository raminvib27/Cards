// DeckofStrings.java
// Vibu Ramineni
// 10/25/2026

public class DeckofStrings
{
    private String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
    private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String[] cards = new String[52];

    public void generateStrings()
    {
        int index = 0;

        for (int i = 0; i < suits.length; i++)
        {
            for (int yessir = 0; yessir < values.length; yessir++)
            {
                cards[index] = values[yessir] + " of " + suits[i].charAt(0);
                index++;
            }
        }
    }

    public void printArray()
    {
        for (int i = 0; i < cards.length; i++)
        {
            System.out.println(cards[i]);
        }
    }
}
