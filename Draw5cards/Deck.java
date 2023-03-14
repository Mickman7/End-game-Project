import java.util.*;
public class Deck
{
    private ArrayList<Card> deck = new ArrayList<Card>();
    //private String suits[] = {"Spade","Club","Diamond","Heart"};
    //private String numbers[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

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

    public void removeCard(int i){
        this.deck.remove(i);
    }

    public Card takeCard(int i){
        return this.deck.get(i);
    }

    public void addCard(Card add){
        this.deck.add(add);
    }

    public void drawFiveCards(Deck from){
        for(int i = 0; i < 5; i++){
            this.deck.add(from.takeCard(0));
            from.removeCard(0);
        }
    }
    
}