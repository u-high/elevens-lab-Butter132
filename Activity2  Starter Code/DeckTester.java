/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  
   String[] ranks = {"jack", "queen", "king", "ace", "ohmygod"};
   String[] suits = {"blue", "red", "green", "cyan"};
   int[] pointValues = {11, 12, 13, 1, 9001};
   
   Deck cool = new Deck(ranks,suits,pointValues);
   //System.out.println(cool.size());
   System.out.println(cool.toString());
   
 }
}
