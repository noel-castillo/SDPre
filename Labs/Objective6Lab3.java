public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    String oddEven;

    while ( counter <= 20 ){
    if ( (counter + 2) % 2 == 0 )
      oddEven = " is even";
    else
      oddEven = " is odd";
    System.out.println( counter + oddEven );
    counter++;
    }
  }
}
