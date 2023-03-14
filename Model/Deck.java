import java.util.*;
public class Deck
{
    private ArrayList<Card> deck = new ArrayList<Card>();

    public void setDeck(ArrayList<Card> deck){
        this.deck = deck;
    }
   
    
    //creating all cards in deck
    public void createCards(){
        for (Suits s : Suits.values()) {
            for (Rank r : Rank.values()) {
                //Card c = new Card(s,r);
                this.deck.add(new Card(s,r));
            }  
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
        //System.out.println(this.deck);
    }

    public String toString(){
        String printCards = "";
        for(Card aCard : this.deck){
            printCards += "\n" + aCard.toString();
            
        }
        return printCards;
    }

   
    
}