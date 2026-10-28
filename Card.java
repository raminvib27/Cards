// Card.java
// Vibu Ramineni
// 10/28/2026

public class Card
{
    private String suit;
    private char value;
    private int point;

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
