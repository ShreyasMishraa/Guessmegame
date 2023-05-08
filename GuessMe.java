import java.util.Random;

public class GuessMe{

  
   private String word;
   private boolean wordFound;
   private  int remainingGuesses;
   private Random rand;
    
   
  
   public GuessMe(){
  wordFound = false;
  remainingGuesses = 10;
  rand = new Random();
  word = generateWord();
 
  
   } 
   
  /*  This is our second constructor. There is only one real difference: in this one we take in an
   *  int which will act as the seed for our Random object. This is used for the tests.
   */
   public GuessMe(int seed){
   wordFound = false;
  remainingGuesses = 10;
  rand = new Random(seed);
  word = generateWord();
   }
   
  /*  This is our play method. It takes in a String called 'str' and compares it to the word the
   *  player is trying to guess 'word'. It returns an int representing the number of letters which
   *  are in the exact same place in both words. For example, if the word to find were "ABCD" play
   *  would return:
   *  
   *     1 on "AAAA" 
   *     2 on "ABAA" 
   *     2 on "AAAD" 
   *     4 on "ABCD" 
   *     4 on "abcd" 
   *
   *  NOTE these values are ONLY for the example word "ABCD" and will not be the same for your random
   *  word. Looping and using charAt() on the strings would be very useful here. Remember we do not
   *  care about upper/lower case here, so be sure to account for that.
   *
   *  We also want to decrement the user's remaining guesses, and in the event they guess the word
   *  we will also update wordFound to true before returning 4.
   */
   public int play(String str){
   
   int numCorrect = 0;
   
   for ( int i = 0; i < 4; i++)
   if (word.charAt(i) == str.charAt(i)) {
   numCorrect +=1;
   return numCorrect;
   }
   
       return numCorrect;
    }
   
  /*  isOver simply returns true if the game is over, which is either when the player runs
   *  out of guesses or when they have found the correct word. It returns false otherwise.
   */
   public boolean isOver(){
   if(wordFound = false){
   remainingGuesses =0;
   return true;
   }
   else {
      return false;
   }
   }
   
  /*  isWin returns true if the player has correctly guessed the word and false otherwise.
   */
   public boolean isWin(){
   if(wordFound = true){
   return true;
   }
      return false;
   }
   
  /*  getRemainingGuesses returns the number of remaining guesses the player has.
   */
   public int getRemainingGuesses(){
   int j = 10;
   for (j=10; j>0 ; j=j-1){
   }
      return remainingGuesses;
   }
   
  /*  reset returns nothing but resets the game. 'remainingGuesses' and 'wordFound' go back to 
   *  their default values and a new word is generated with generateWord().
   */
   public void reset(){
   }
   
  /*  getWord simply returns the word the user is attempting to guess. It is not tested,
   *  and is only used in the main method. 
   */
   public String getWord(){
      return word;
   }
   
   /**********************************/
   /*         Helper Methods         */
   /**********************************/
   
  /*  A helper method is a private method which cannot be accessed outside of the file. Its
   *  sole purpose is to be used in other constructors/methods and simply 'helps' them do their
   *  job better. In our case, we need to generate a random word occassionally, so we make
   *  a helper method so that we don't have to write the same code repeatedly.
   *
   *  We will go about writing this by using our Random object. We will call nextInt(4) on our
   *  Random object a total of four times to generate four different ints. Specifying 4 in the
   *  method call forces it to generate an int between 0 and 4, including 0 but not including 4.
   *  The ints correspond to a letter to add to our word as such:
   *
   *     0: 'A'
   *     1: 'B'
   *     2: 'C'
   *     3: 'D'
   *
   *  We can build our String by starting with local variable which is an empty String ("") which we can 
   *  call retStr. Using String concatination (+=), we can add letters to our String based on the int 
   *  generated. Once we have done this 4 times, we can return the String. We do not use any instance 
   *  variables in this method. It may be helpful to use a loop here.
   */
   private String generateWord(){
   String retstring =" ";
     int  num;
   for (int i=0; i<4; i++){
  //  num= rand.nextint(4);
   // if {
   }
   
   
   
   
      return "";
   }
   
}