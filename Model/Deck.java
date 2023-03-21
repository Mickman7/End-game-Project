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
            int number = 0;
            for (Rank r : Rank.values()) {
                if (number < 10){
                    number++;
                }
                this.deck.add(new Card(s,r,number));
            }  
        }
    }


    public String toString(){
        String printCards = "";
        for(Card aCard : this.deck){
            printCards += "\n" + aCard.toString();
            
        }
        return printCards;
    }

   
    
}