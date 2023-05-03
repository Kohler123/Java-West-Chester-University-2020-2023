
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by rohandalvi on 5/14/16.
 */
import java.util.ArrayList;

public class CardDeck 
{
    private ArrayList<Card> cards;

    CardDeck()
    {
        cards = new ArrayList<>();

        for(Card.Suit s: Card.Suit.values())
        {
            for(Card.Rank r: Card.Rank.values())
            {
                cards.add(new Card(r,s));
            }
        }
    }    

    public static void main(String[] args)
    {
        CardDeck deck = new CardDeck();

        System.out.println(deck);
    }

    @Override
    public String toString()
    {
        String result = cards.size() + " cards:" + System.lineSeparator();
        for (Card card : cards)
        {
            result = result.concat(card + System.lineSeparator());
        }

        return result;
    }
}

class Card
{
    private Suit suit;
    private Rank rank;

    public  enum  Suit
    {
        Spade , Heart , Diamond , Clubs
    }

    public enum Rank
    {
        ACE(1) , TWO(2), THREE(3), FOUR(4), FIVE(5) , SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN (10), JACK(11), QUEEN (12), KING(13);

        int priority;

        Rank(int s) 
        {
            priority = s;
        }

        public int getPriority()
        {
            return priority;
        }

        public Rank getRankByPriority(int p)
        {
            switch (p)
            {
                case 1: return Rank.ACE;
                case 2: return Rank.TWO;
                case 3: return Rank.THREE;
                case 4: return Rank.FOUR;
                case 5: return Rank.FIVE;
                case 6: return Rank.SIX;
                case 7: return Rank.SEVEN;
                case 8: return Rank.EIGHT;
                case 9: return Rank.NINE;
                case 10: return Rank.TEN;
                case 11: return Rank.JACK;
                case 12: return Rank.QUEEN;
                case 13: return Rank.KING;

                default: return null;
            }
        }
    }

    Card(Rank rank, Suit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    Rank getRank()
    {
        return rank;
    }

    Suit getSuit()
    {
        return suit;
    }

    @Override
    public String toString()
    {
        return "rank: " + rank + "\t suit: " + suit; 
    }
}