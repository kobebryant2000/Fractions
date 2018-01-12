package code;

public class Runner {
    public static void main(String[] args) {
        Fraction myFraction = new Fraction(2, 0);
        Fraction otherFraction = new Fraction(5);
        Fraction a = myFraction;
        Fraction multiplied = myFraction.multiply(otherFraction);
        System.out.println(multiplied);


        {
         /*   Fraction f1;
            try
            {
                Fraction f1 = new Fraction(3, 0);
            }
            catch (Exception e)
            {
                System.out.println("Fractions need a non-zero denominator");
            }
        }
    }
}*/
            Fraction myFraction = new Fraction(12, 4);
            System.out.println(myFraction);
        }
