// Deck.java
// Vibu Ramineni
// 10/28/2026

public class Deck
{
    Card[] deckOfCards; // declare only at this point

    public Deck(String[] suits, String[] values, String[] points)
    {
        deckOfCards = new Card[suits.length * values.length];

        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < values.length; j++)
            {
                deckOfCards[i] = new Card(suits[i], values[j], points[j]);
            }
        }
    }

    public shuffle()
    {

    }

    public deal()
    {

    }
}
