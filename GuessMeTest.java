import java.util.*;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.*;


public class GuessMeTest {
   
   private GuessMe game;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      game = new GuessMe(1234);
   }
   
   /** Ensures word variable exists **/
   @Test public void instanceExistsTest1() {
      String word = "";
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field wordField = GuessMe.class.getDeclaredField("word");
         wordField.setAccessible(true);
         word = (String)wordField.get(game);
         Assert.assertEquals("word instance variable exists", 1, 1);
      } catch (Exception e){
         Assert.fail("word instance variable doesn't exist");
      }
   }
   
   /** Ensures remainingGuesses variable exists **/
   @Test public void instanceExistsTest2() {
      int remainingGuesses = -1;
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field intField = GuessMe.class.getDeclaredField("remainingGuesses");
         intField.setAccessible(true);
         remainingGuesses = (Integer)intField.get(game);
         Assert.assertEquals("remainingGuesses instance variable exists", 1, 1);
      } catch (Exception e){
         Assert.fail("remainingGuesses instance variable does not exist");
      }
   }
   
   /** Ensures wordFound variable exists **/
   @Test public void instanceExistsTest3() {
      boolean wordFound = true;
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field booleanField = GuessMe.class.getDeclaredField("wordFound");
         booleanField.setAccessible(true);
         wordFound = (Boolean)booleanField.get(game);
         Assert.assertEquals("wordFound instance variable exists", 1, 1);
      } catch (Exception e){
         Assert.fail("wordFound instance variable does not exist");
      }
   }
   
   /** Ensures rand variable exists **/
   @Test public void instanceExistsTest4() {
      Random rand = null;
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field randField = GuessMe.class.getDeclaredField("rand");
         randField.setAccessible(true);
         rand = (Random)randField.get(game);
         Assert.assertEquals("rand instance variable exists", 1, 1);
      } catch (Exception e){
         Assert.fail("rand instance variable does not exist");
      }
   }
   
   /** Ensures constuctor initializes word correctly **/
   @Test public void constructorTest1(){
      String word = "";
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field wordField = GuessMe.class.getDeclaredField("word");
         wordField.setAccessible(true);
         word = (String)wordField.get(game);
      } catch (Exception e){}
      Assert.assertEquals("constructor initializes word correctly", "CBDA", word);
   }
   
   /** Ensures constuctor initializes remainingGuesses correctly **/
   @Test public void constructorTest2(){
      int remainingGuesses = -1;
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field intField = GuessMe.class.getDeclaredField("remainingGuesses");
         intField.setAccessible(true);
         remainingGuesses = (Integer)intField.get(game);
      } catch (Exception e){}
      Assert.assertEquals("constructor initializes word correctly", 10, remainingGuesses);
   }
   
   /** Ensures constuctor initializes wordFound correctly **/
   @Test public void constructorTest3(){
      boolean wordFound = true;
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field booleanField = GuessMe.class.getDeclaredField("wordFound");
         booleanField.setAccessible(true);
         wordFound = (Boolean)booleanField.get(game);
      } catch (Exception e){}
      Assert.assertEquals("constructor initializes word correctly", false, wordFound);
   }
   
   /** Ensures constuctor initializes rand correctly **/
   @Test public void constructorTest4(){
      Random rand = null;
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field randField = GuessMe.class.getDeclaredField("rand");
         randField.setAccessible(true);
         rand = (Random)randField.get(game);
      } catch (Exception e){}
      Assert.assertNotNull("Constructor initializes rand", rand);
      int i = rand.nextInt();
      Assert.assertEquals("Constructor initializes rand correctly", -611652875, i);
   }
   
   /** Ensures constuctor initializes rand correctly **/
   @Test public void constructorTest5(){
      game = new GuessMe();
      Random rand = null;
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field randField = GuessMe.class.getDeclaredField("rand");
         randField.setAccessible(true);
         rand = (Random)randField.get(game);
      } catch (Exception e){}
      Assert.assertNotNull("Constructor initializes rand", rand);
      int i = rand.nextInt(2);
   }
   
   /** Ensures reset resets word correctly **/
   @Test public void resetTest1(){
      game.reset();
      String word = "";
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field wordField = GuessMe.class.getDeclaredField("word");
         wordField.setAccessible(true);
         word = (String)wordField.get(game);
      } catch (Exception e){}
      Assert.assertEquals("reset resets word correctly", "DBBC", word);
   }
   
   /** Ensures reset resets remainingGuesses correctly **/
   @Test public void resetTest2(){
      game.reset();
      int remainingGuesses = -1;
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field intField = GuessMe.class.getDeclaredField("remainingGuesses");
         intField.setAccessible(true);
         remainingGuesses = (Integer)intField.get(game);
      } catch (Exception e){}
      Assert.assertEquals("reset resets remainingGuesses correctly", 10, remainingGuesses);
   }
   
   /** Ensures reset resets wordFound correctly **/
   @Test public void resetTest3(){
      boolean wordFound = true;
      try{
         /* Note that you do not need to understand how this test works. This is some
          * fancy stuff to get around the fact that these variables are private. You
          * should not try to do this outside of testing, as it defeats the purpose of
          * things being private */
         Field booleanField = GuessMe.class.getDeclaredField("wordFound");
         booleanField.setAccessible(true);
         booleanField.set(game, true);
         game.reset();
         wordFound = (Boolean)booleanField.get(game);
      } catch (Exception e){}
      Assert.assertEquals("reset resets wordFound correctly", false, wordFound);
   }    
   
   /** tests isOver on remainingGuesses **/
   @Test public void isOverTest1(){
      for(int i = 0; i < 10; i++){
         game.play("AAAA");
      }
      Assert.assertEquals("isOver works when remaining guesses are zero", true, game.isOver());
   }
   
   /** tests isOver on wordFound **/
   @Test public void isOverTest2(){
      game.play("CBDA");
      Assert.assertEquals("isOver works when word has been found", true, game.isOver());
   }
   
   /** tests isWin on win **/
   @Test public void isWinTest1(){
      game.play("cbda");
      Assert.assertEquals("isWin works when word has been found", true, game.isWin());
   }
   
   /** tests isWin on win **/
   @Test public void isWinTest2(){
      game.play("aaaa");
      Assert.assertEquals("isWin works when word has not been found, but is implemented", false, game.isWin());
      game.play("cbda");
      Assert.assertEquals("isWin works when word has not been found, but is implemented", true, game.isWin());
   }
   
   /** tests getRemainingGuesses **/
   @Test public void getRemainingGuessesTest1(){
      game.play("aaaa");
      game.play("bbbb");
      game.play("cccc");
      game.play("dddd");
      Assert.assertEquals("getRemainingGuess returns correct value", 6, game.getRemainingGuesses());
   }
   
   /** tests play on win **/
   @Test public void playTest1(){
      Assert.assertEquals("play returns correct value on win", 4, game.play("CBDA"));
   }
   
   /** tests play on win lower case **/
   @Test public void playTest2(){
      Assert.assertEquals("play returns correct value on lower case", 4, game.play("cBda"));
   }
   
   /** tests play on win **/
   @Test public void playTest3(){
      Assert.assertEquals("play returns correct value on non win", 1, game.play("AAAA"));
   }
   
   /** tests play on non win lower case **/
   @Test public void playTest4(){
      Assert.assertEquals("play returns correct value on non win lower case", 1, game.play("aaaa"));
   }
}