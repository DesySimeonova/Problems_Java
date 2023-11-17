// Card class represents a playing card.
package problem1;
public class Card
{
    private String face;
    private String suit;

    public Card( String cardFace, String cardSuit )
    {
        face = cardFace; // initialize face of card
        suit = cardSuit; // initialize suit of card
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public String toString()
    {
        return face + " of " + suit;
    } // end method toString
}




