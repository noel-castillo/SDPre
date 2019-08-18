import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ){
    String name, lastname;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.println( "Any last name to go with that? " );
    lastname = keyboard.next();

    System.out.print( "Hi, " + name + " " + lastname + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old. " );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.println( "Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );
  }
}
// Study Drills
// 1. The program will not blow up if you enter an integer when expecting a double
// 2. The program will not blow up if you enter a numeric value when expecting a String
// 3. The program will blow up if you enter a letter when expecting a numeric value.
//    Nothing makes the 1st question blow up.
// 4. Added above
