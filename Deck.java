// Deck.java
// Vibu Ramineni
// 10/28/2026

public class Deck
{
    private Card[] deckOfCards; // holds all the cards
    private int nextCard; // next card to deal

    // make deck from suits, values, and points
    public Deck(String[] suits, String[] values, int[] points)
    {
        deckOfCards = new Card[suits.length * values.length];
        nextCard = 0;
        int index = 0;

        // make every suit and value combination
        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < values.length; j++)
            {
                // points[j] goes with values[j]
                deckOfCards[index] = new Card(suits[i], values[j], points[j]);
                index++;
            }
        }
    }

    // get deck array
    public Card[] getDeckOfCards()
    {
        return deckOfCards;
    }

    // change deck array
    public void setDeckOfCards(Card[] cards)
    {
        deckOfCards = cards;
        nextCard = 0;
    }

    // shuffly sometime soon????? idk
    public void shuffle()
    {

    }

    // deal more than one card
    public Card[] deal(int amount)
    {
        // return null if there are not enough cards b/c that's what competent coders do apparently
        if (amount < 0 || amount > deckOfCards.length - nextCard)
        {
            return null;
        }

        Card[] cards = new Card[amount];

        // put each dealt card into the array
        for (int i = 0; i < amount; i++)
        {
            cards[i] = dealCard();
        }

        return cards;
    }

    // deal one card
    public Card dealCard()
    {
        if (nextCard < deckOfCards.length)
        {
            Card card = deckOfCards[nextCard];
            nextCard++;
            return card;
        }

        return null; // no cards left :(
    }
}
