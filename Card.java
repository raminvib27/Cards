// Card.java
// Vibu Ramineni
// 10/28/2026

public class Card
{
    private String suit; // hearts, diamonds, etc.
    private char value;  // 2 - 10, J, Q, J, A
    private int point;   // 1 - 14?

    public Card(String[] s, String[] v, String[] p)
    {
        suit = s;
        value = v;
        point = p;
    }

    public String getSuit()
    {
        return suit;
    }

    public char getValue()
    {
        return value;
    }

    public int getPoint()
    {
        return point;
    }
}
