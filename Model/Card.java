public class Card
{
    private Suits suit;
    private Rank value;
    private int number;

    public Card(Suits suit, Rank value, int number)
    {
        this.suit = suit;
        this.value = value;
        this.number = number;
    
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

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    
    public String toString(){
        return this.suit.toString() + "-" + this.value.toString() + "-"+this.number;
    }

    

}