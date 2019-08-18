public class CreatingVariables{
  public static void main( String[] args ){
    int x, y, age, z;
    double seconds, e, checking, savings;
    String firstName, lastName, title, birthmonth, birthzodiac;

    x = 10;
    y = 400;
    age = 39;
    z = x + y;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    savings = 12.39;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    birthmonth = "December";
    birthzodiac = "Capricorn";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y" );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "The sum of variables x and y is: " + z );
    System.out.println( "Thankfully I have saved $" + savings );
    System.out.println( "I was born in " + birthmonth + " and my zodiac is " + birthzodiac );

  }
}
