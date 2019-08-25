import java.util.Scanner;

public class SafeSquareRoot{
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String readyOrNot;

    System.out.print( "Give me a number, and I'll find it's square root. " );
    System.out.print( "(No negatives, please.)" );
    x = keyboard.nextDouble();

    while ( x < 0 ){
      System.out.println( "I won't take the square root of a negative." );
      System.out.print( "\nNewnumber: " );
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println( "The square root of " + x + " is " + y );

    readyOrNot = keyboard.nextLine().toLowerCase();

    while ( ! readyOrNot.equals("yes!") ){
      if ( readyOrNot.equals("yes") ){
        System.out.println( "Not enough enthusiasm!! " );
      }
      System.out.println( "Are you ready?!?" );
      readyOrNot = keyboard.nextLine().toLowerCase();
    }
  }
}
