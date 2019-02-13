/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  Card king = new Card( "King", "Spades", 13);
  Card notKing = new Card("Jack", "Hearts", 11);
  Card kingCopy = new Card( "King", "Spades", 13);
  
  System.out.println(king.rank());
    System.out.println(king.suit());
      System.out.println(king.pointValue());
      
  System.out.println(king.matches(notKing));
    System.out.println(king.matches(kingCopy));
    
  System.out.println(king.toString());
 }
}
