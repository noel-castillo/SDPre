import java.util.Scanner;

public class BMICalculator{
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double m, kg, inches, pounds, feet, bmi;

    System.out.print( "Your height in m: " );
    m = keyboard.nextDouble();

    System.out.print( "Your weight in kg: " );
    kg = keyboard.nextDouble();

    bmi = kg / ( m * m );

    System.out.println( "Your BMI is " + bmi );

    //Study Drills
    System.out.print( "Your height (feet only): " );
    feet = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    inches = keyboard.nextDouble();

    inches = ( feet * 12 ) + inches;

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    bmi = ( pounds / 2.205 ) / ( ( inches / 39.37 ) * ( inches / 39.37 ) );

    System.out.println( "Your BMI is " + bmi );
  }
}
