import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double a, b, c;
    double first;
    double second;
    System.out.println("Enter the a: ");
    a = scanner.nextDouble();
    System.out.println("Enter the b: ");
    b = scanner.nextDouble();
    System.out.println("Enter the c: ");
    c = scanner.nextDouble();
    first = a * a + b * b;
    second = c * c;
    if (first == second) {
      System.out.println("it's triangle");
    } else {
      System.out.println("it's not a triagnle");
    }
  }
}
