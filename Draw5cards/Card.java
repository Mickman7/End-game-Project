public class Card
{
    private Suits suit;
    private Rank value;

    public Card(Suits suit, Rank value)
    {
        this.suit = suit;
        this.value = value;
    }

    public void setSuit(Suits s){
      this.suit = s;
    }
    public Suits getSuit(){
        return this.suit;
    }

    public void setValue(Rank v){
        this.value = v;
    }
    public Rank getValue(){
        return this.value;
    }
    
    public String toString(){
        return this.suit.toString() + "-" + this.value.toString();
    }

}