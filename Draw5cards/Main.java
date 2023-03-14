import java.util.*;
public class Main
{
    public static void main(String[]args) {
      System.out.println("Welcome to the game");
      
      
      
      Deck PlayingDeck = new Deck();	  	  	  	        	      	   	    	
      PlayingDeck.createCards();
      //System.out.println(PlayingDeck);

      PlayingDeck.shuffleDeck();
      //System.out.println(PlayingDeck);

      Deck player1Hand = new Deck();
      player1Hand.drawFiveCards(PlayingDeck);

      System.out.println(player1Hand);

      Deck player2Hand = new Deck();

      int Bet = 100;

    }
}