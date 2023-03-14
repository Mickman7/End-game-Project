import java.util.*;
public class Main
{
  public static void main(String[]args) {
    

    Deck PlayingDeck = new Deck();
    PlayingDeck.createCards();
    PlayingDeck.shuffleDeck();

    
    //Card flippedCard = PlayingDeck.takeCard();
    PlayingDeck.removeCard(0);

    Card Hand = PlayingDeck.takeCard();
    PlayingDeck.removeCard(0);

    Scanner HorL = new Scanner(System.in);
    boolean isOver = false;
    int score = 0;

    while(isOver == false){
      Card flippedCard = PlayingDeck.takeCard();
      boolean valid = false;
      System.out.println("Game start");
      while(valid == false){
        System.out.println("Higher or Lower");
        String answer = HorL.nextLine();
        if(answer.equalsIgnoreCase("H")){
          valid = true;
          if(Hand.getNumber() < flippedCard.getNumber()){
            System.out.println("You won");
            System.out.println("You had the card " + Hand);
            score++;
          }
          else {
            System.out.println("You lost!");
            isOver = true;
            System.out.println("Your final score is: " + score);  
          }

        }
        else if(answer.equalsIgnoreCase("L")){
          valid = true;
          if(Hand.getNumber() > flippedCard.getNumber()){
            System.out.println("You won");
            System.out.println("You had the card " + Hand);
            score++;
          }
          else{
            System.out.println("You lost!!");
            isOver = true;
            System.out.println("Your final score is: " + score);  
          }
          
        }  
        else{System.out.println("Invalid input!!!");}

      }
      PlayingDeck.addCard(Hand);
      Hand = flippedCard;
      PlayingDeck.shuffleDeck();
      //HorL.close();
    }   
  
 }
  
}