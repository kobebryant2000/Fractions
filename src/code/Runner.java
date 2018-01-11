package code;

public class Runner
{
    public static void main (String[] args)
    {
       Fraction myFraction = new Fraction(2,3 );
       Fraction otherFraction = new Fraction(5);
       Fraction a = myFraction;
       Fraction multiplied = myFraction.multiply(otherFraction);
       Fraction divided = myFraction.divide(otherFraction);
       System.out.println(multiplied);


    }
}
