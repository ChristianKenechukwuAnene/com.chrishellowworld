

public class FractionTest {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(3,4);

        System.out.println(f1.toString());
        System.out.println(f2.toString());


        System.out.println(f1.multiplication(f1,f2));
        System.out.println(f1.addition(f1,f2));
        System.out.println(f1.division(f1,f2));
        System.out.println(f1.subtraction(f1,f2));




    }
}
