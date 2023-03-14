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
            int number = 0;
            for (Rank r : Rank.values()) {
                if (number < 10){
                    number++;
                }
                this.deck.add(new Card(s,r,number));
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

    public Card takeCard(){
        return this.deck.get(0);
    }

    public void addCard(Card add){
        this.deck.add(add);
    }

    public void drawCards(Deck from){ 
        this.deck.add(from.takeCard());
        from.removeCard(0);   
    }
    
}