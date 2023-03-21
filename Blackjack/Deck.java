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

    public void drawCards(Deck from){ 
        this.deck.add(from.takeCard(0));
        from.removeCard(0);   
    }

    public int sizeOfDeck(){
        return this.deck.size();
    }

    public int cardsValue(){
        int totalValue = 0;
        int aces = 0;
        for(Card aCard :  this.deck){
            switch(aCard.getValue()){
                case TWO: totalValue += 2; break;
                case THREE: totalValue += 3; break;
                case FOUR: totalValue += 4; break;
                case FIVE: totalValue += 5; break;
                case SIX: totalValue += 6; break;
                case SEVEN: totalValue += 7; break;
                case EIGHT: totalValue += 8; break;
                case NINE: totalValue += 9; break;
                case TEN: totalValue += 10; break;
                case JACK: totalValue += 10; break;
                case QUEEN: totalValue += 10; break;
                case KING: totalValue += 10; break;
                case ACE: aces += 1; break;
            }
        }
        for(int i = 0; i < aces; i++){
            if(totalValue > 10){
                totalValue += 1;
            }
            else{totalValue += 11;}
        }
     return totalValue;    
    }   

    public void backToDeck(Deck moveTo){
        int deckSize = this.deck.size();
        for(int i = 0; i < deckSize; i++){
            moveTo.addCard(this.takeCard(i));
        }
        for(int i = 0; i < deckSize; i++){
            this.removeCard(0);
        }
    }

    
}