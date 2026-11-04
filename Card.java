// Card.java
// Vibu Ramineni
// 10/28/2026

public class Card
{
    private String suit; // hearts, diamonds, etc.
    private String value; // 2 - 10, J, Q, K, A
    private int point; // points for card

    // make one card
    public Card(String s, String v, int p)
    {
        suit = s;
        value = v;
        point = p;
    }

    // get suit
    public String getSuit()
    {
        return suit;
    }

    // get value
    public String getValue()
    {
        return value;
    }

    // get points
    public int getPoint()
    {
        return point;
    }

    // change points
    public void setPoint(int p)
    {
        point = p;
    }

    public String toString()
    {
        return "A" + value;
    }
}
