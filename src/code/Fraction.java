package code;

public class Fraction {
    private int num, denom;

    public Fraction(int num, int denom)
    {
        if (denom ==0)
        {
            throw new IllegalArgumentException("Fractions can't have a zero in the denominator");
        }
        else
            {
                this.num = num;
            this.denom = denom;
            Simplify();
        }
    }

    public Fraction(int num) {
        this.num = num;
        denom = 1;
    }

    public Fraction(Fraction other) {
        num = other.num;
        denom = other.denom;
    }

    public String toString() {
        return num + "/" + denom;
    }

    public Fraction multiply(Fraction f)
    {
        return new Fraction (num*f.num, denom*f.denom);
    }
    public Fraction divide(Fraction f)
    {
        return new Fraction (num*f.num, denom*f.denom);
    }
    public static int gcf (int a, int b)
    {
        int min = Math.min(a,b);
        for (int i = min; i > 0; i--)
        {
            if (a%i == 0 && b%i == 0) return i;
        }
        return 1;
    }
    private void simplify() {
        int mult = Math.max(a, b);

        while (mult % a != 0 || mult % b != 0)
        {
            mult += Math.max(a,b);
        }
            return mult;

    }
        {
            int factor = gcf(num,denom);
                num /= factor;
                denom /= factor;
            }
        }
    }
