

public class Fraction {

  private int numer, denom;

  public Fraction(){
    this(1, 1);
  }

  public Fraction(int n,int d) {
    numer = n;
    denom = d;
  }

  public int numerator(){
    return numer;
  }

  public int denominator() {
    return denom;
  }

  public String toString() {
    return numer + "/" + denom;
  }

  public Fraction add(Fraction other) {
    int n = numer * other.denom + other.numer * denom;
    int d = denom * other.denom;
    return new Fraction(n,d);
  }

  public Fraction substract(Fraction other) {
    int n = numer * other.denom - other.numer * denom;
    int d = denom * other.denom;
    return new Fraction(n,d);
  }

  public Fraction multiply(Fraction other) {
    int n = numer * other.numer;
    int d = denom * other.denom;
  }

  // public Fraction division(Fraction other)


  public static void main(String[] args) {
    System.out.println(new Fraction(1,4).add(new Fraction(1,2)));
    // System.out.println(Add(1,2,3,4));
    // System.out.println(Minus(1,2,3,4));
    // System.out.println(Multiply(1,2,3,4));
    // System.out.println(Division(1,2,3,4));
  }
}
