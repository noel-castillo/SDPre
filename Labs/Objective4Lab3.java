import java.util.Scanner;

public class Objective4Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();

      if ( userNum > 0 ){
        System.out.println( userNum + " is GREATER THAN 0." );
        System.out.println( "The number is positive" );
      }
      else if ( userNum < 0 ){
        System.out.println( userNum + " is LESS THAN 0." );
        System.out.println( "The number is negative" );
      }
      else if ( userNum == 0 ){
        System.out.println( userNum + " is EQUAL TO 0" );
      }
      scanner.close();
  }
}
