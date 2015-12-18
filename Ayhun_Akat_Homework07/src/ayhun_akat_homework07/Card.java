package ayhun_akat_homework07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card implements Comparable {
    
    @Override
    public int compareTo(Object obj){
        if (obj == null){
            return -1;
        }
        if (getClass() != obj.getClass()){
            return -1;
        }
        final Card other = (Card) obj;
        if (this.suit.ordinal() > other.suit.ordinal()){
            return 1;
        }
        if (this.suit.ordinal() < other.suit.ordinal()){
            return -1;
        }
        if (this.rank.ordinal() > other.rank.ordinal()){
            return 1;
        }
        if (this.rank.ordinal() < other.rank.ordinal()){
            return -1;
        }
        return 0;
    }
    private Suit suit;
    private Rank rank;
    
    public Card(Suit suit,Rank rank){
        this.suit = suit;
        this.rank = rank;
    }
    
    public Rank getRank(){
        return rank;
    }
    
    public Suit getSuit(){
        return suit;
    }
    
    @Override
    public String toString(){
        return "{" + suit + "," + rank + '}';
    }
    public enum Suit{
        CLUBS("\u2663"),
        DIAMONDS("\u2666"),
        HEARTS("\u2665"),
        SPADES("\u2660");
        
        private String symbol;
        
        private Suit(String symbol){
            this.symbol = symbol;
        }
        
        @Override
        public String toString(){
            return symbol;
        }
    }
    public enum Rank{
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        JACK("J"),
        QUEEN("Q"),
        KING("K"),
        ACE("A");
        
        private String symbol;
        
        private Rank(String symbol){
            this.symbol = symbol;
        }
        
        @Override
        public String toString(){
            return symbol;
        }
    }
    public static void main(String[] args) {
        List deck = new ArrayList();
        
        for(Suit suit:Suit.values()){
            for(Rank rank:Rank.values()){
                Card card = new Card(suit,rank);
                deck.add(card);
            }
        }
        System.out.println("deck:"+deck);
        
        Collections.shuffle(deck);
        
        System.out.println("deck:"+deck);
        
        Collections.sort(deck);
        
        System.out.println("deck:"+deck);
    }
}