// DeckofStrings.java
// Vibu Ramineni
// 10/25/2026
// makes cards arr w/ elements of suits x values

public class DeckofStrings
{
    private String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
    private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String[] cards = new String[suits.length * values.length];

    // generate values for cards arr by putting combinations of suits x values
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

    // print values of cards arr
    public void printArray()
    {
        for (int i = 0; i < cards.length; i++)
        {
            System.out.println(cards[i]);
        }
    }
}
