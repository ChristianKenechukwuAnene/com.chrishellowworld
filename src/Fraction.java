public class Fraction {
    private int numerator;   //Attribute
    private int denominator;

    public Fraction(){
        this (0,1);  //No Argument Constructor
    }

    public  Fraction(int numerator, int denominator)  // Multiple Argument Constructor
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    public void setNumerator(int numerator){
        this.denominator = denominator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }


    public String toString(){                                   //toString method

            return getNumerator() + "/" + getDenominator();

    }
    public  Fraction addition(Fraction f1, Fraction f2){
        return new Fraction(0,1);
}
  public int subtraction (Fraction f1,Fraction f2){
        return  f1.getNumerator()-f2.getNumerator() ;
  }
    public int multiplication (Fraction f1,Fraction f2){
        return f1.getDenominator()-f2.getDenominator();
    }
    public int division (Fraction f1,Fraction f2){
        return f1.getDenominator()-f2.getDenominator();
    }
}
