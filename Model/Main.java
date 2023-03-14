import java.util.*;
public class Main
{
    public static void main(String[]args) {
      
      Deck PlayingDeck = new Deck();	  	  	  	        	      	   	    	
      PlayingDeck.createCards();
      //System.out.println(PlayingDeck);

      PlayingDeck.shuffleDeck();
      System.out.println(PlayingDeck);

      Deck player1Hand = new Deck();
      Deck player2Hand = new Deck();

      

    }
}