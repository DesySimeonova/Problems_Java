// DeckOfCards class represents a deck of playing cards.
package problem1;
import java.util.Random;

public class DeckOfCards
{
    private Card deck[];
    private int currentCard; // index of next Card to be dealt
    private final int NUMBER_OF_CARDS = 52; // constant number of Cards
    private Random randomNumbers;

    // constructor fills deck of Cards
    public DeckOfCards()
    {
        String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new Card[ NUMBER_OF_CARDS ];
        currentCard = 0;
        randomNumbers = new Random();

        for ( int count = 0; count < deck.length; count++ )
            deck[ count ] =
                    new Card( faces[ count % 13 ], suits[ count / 13 ] );
    }

    // shuffle deck of Cards with one-pass algorithm
    public void shuffle()
    {
        currentCard = 0;

        // for each Card, pick another random Card and swap them
        for ( int first = 0; first < deck.length; first++ )
        {
            int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );

            Card temp = deck[ first ];
            deck[ first ] = deck[ second ];
            deck[ second ] = temp;
        }
    }
    public Card dealCard()
    {
        //we place back a picked card and shuffle before picking another
        shuffle();
        currentCard=0;
        if ( currentCard < deck.length )
            return deck[ currentCard ];
        else
            return null; 
    }
}

