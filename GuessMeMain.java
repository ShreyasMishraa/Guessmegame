import java.util.*;
import java.util.Random;

public class GuessMeMain{

   public static void main(String[] args){
      
     
      Scanner scan = new Scanner(System.in);
      
      boolean again = true;
      
      System.out.println("Welcome to Guess Me!");
      System.out.println("A random word will be generated. It will be four letters long and\nconsist of the letters 'A', 'B', 'C', and 'D'. Your goal\nis to guess the word within the alloted guesses. Good luck!\n\n");
      GuessMe game = new GuessMe();

      while(again){
         while(!game.isOver()){
            System.out.println("You have " + game.getRemainingGuesses() + " guesses left.");
            System.out.println("Enter your guess:");
            String guess = "";
            while(true){
               guess = scan.nextLine();
               if(guess.length() == 4){
                  break;
               }
               System.out.println("Invalid guess, please enter a 4 letter word consisting of 'A', 'B', 'C', and 'D':");
            }
            int score = game.play(guess);
            System.out.println("There are " + score + " correct letter placements.");
         }
         if(game.isWin()){
            System.out.println("Congrats!");
         } else {
            System.out.println("You lose! The word was: " + game.getWord());
         }
         System.out.println("Would you like to play again? y/n");
         if(Character.toLowerCase(scan.nextLine().charAt(0)) == 'n'){
            again = false;
         } else {
            game.reset();
         }
      }
      System.out.println("Goodbye!");
   }
}