import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Main
{
  public static void main(String[]args) {
    Deck PlayingDeck = new Deck();
    PlayingDeck.createCards();
    PlayingDeck.shuffleDeck();

    Deck player1 = new Deck();
    Deck player2 = new Deck();

    Card Hand = PlayingDeck.takeCard(0);
    PlayingDeck.removeCard(0);

    Scanner HorL = new Scanner(System.in);
    Scanner   betInput =  new Scanner(System.in);
    boolean isOver = false;
    int score = 0;
    double bettingMoney = 200.00;
  

    //Blackjack steps
    //1. place a bet from a total of 100 tokens
    //2.players are delt 2 cards
    //3.player 1 is given the options to hit or stand
    //4.if hit one card is given to the player
    //5.if stand the other player takes a turn
    //6. closest to 21 wins

    while(bettingMoney > 0){
      System.out.println("You have £"+bettingMoney+" Total");
      System.out.println("How much do you want to bet?");
      double bet = betInput.nextDouble();
      if(bet > bettingMoney){
        System.out.println("You can't bet more that you have!");
        break;
      }
      player1.drawCards(PlayingDeck);
      player1.drawCards(PlayingDeck);

      player2.drawCards(PlayingDeck);
      player2.drawCards(PlayingDeck);

      
        System.out.println();
        System.out.println("Player 1's hand: ");
        System.out.println(player1.toString());
        System.out.println("Player 1's hand total is " + player1.cardsValue());
        System.out.println();
        System.out.println("Player 2 hand is: "+ player2.toString());
        System.out.println("Player 2's hand total is " + player2.cardsValue());

        System.out.println();
        
        while(isOver == false){
        //Player 1 options
        System.out.println();
        System.out.println("Player 1's turn");
        System.out.println("pick option 1)Twist or 2) Stick");
        int answer = HorL.nextInt();

        if(answer == 1){
          player1.drawCards(PlayingDeck);
          System.out.println("Player 1 drew: "+player1.takeCard(player1.sizeOfDeck()-1).toString());
          System.out.println("Total: "+player1.cardsValue());
          if(player1.cardsValue() > 21){
            System.out.println("Total cards value: "+ player1.cardsValue());
            System.out.println("You lose. you are over 21");
            bettingMoney -= bet;
            isOver = true;
          }
        }
        if(answer == 2){
          System.out.println("Player 1 chose stick");
        }
      
     

        //Player 2 options
        System.out.println();
        System.out.println("Player 2's turn");
        System.out.println("pick option 1)Twist or 2) Stick");
        int answer1 = HorL.nextInt();

        if(answer1 == 1){
          player2.drawCards(PlayingDeck);
          System.out.println("Player 2 drew: "+player2.takeCard(player2.sizeOfDeck()-1).toString());
          System.out.println("Total: "+player2.cardsValue());
          if(player2.cardsValue() > 21){
            System.out.println("Total cards value: "+ player2.cardsValue());
            System.out.println("Player 1 loses. you are over 21");
            bettingMoney -= bet;
            isOver = true;
          }
        }
        if(answer1 == 2){
          System.out.println("Player 1 chose stick");
        }
        if(answer == 2 && answer1 == 2){
          System.out.println("Player 1 Total is: " + player1.cardsValue());
          System.out.println("Player 2 Total is: " + player2.cardsValue());
          break;
        }
      }
      
        

        if((player2.cardsValue() > player1.cardsValue()) && isOver == false){
          System.out.println("Player 2 wins");
          bettingMoney -= bet;
          isOver = true;
        }
        
        System.out.println();
        if((player2.cardsValue() > 21) && isOver == false){
          System.out.println("Player 2 loses! Player 1 wins");
          bettingMoney += bet;
          isOver = true;
        }
        if(player2.cardsValue() == 21){
          System.out.println("Player 2 wins with a total of 21!");
        }

        if((player1.cardsValue() == player2.cardsValue()) && isOver == false){
          System.out.println("Draw");
          isOver = true;
        }
        if(player1.cardsValue() == 21){
          System.out.println("Player 1 wins with a total of 21!");
        }
        if((player1.cardsValue() > player2.cardsValue()) && isOver == false){
          System.out.println("Player 1 wins");
          bettingMoney += bet;
          isOver = true;
        }
        else if(isOver == false){
          System.out.println("Player 1 loses");
          bettingMoney -= bet;
          isOver = true;
        }
        player1.backToDeck(PlayingDeck);
        player2.backToDeck(PlayingDeck);
        System.out.println("End of Game!");
      }
    System.out.println("You have no money left. Try again");

 }
  
}