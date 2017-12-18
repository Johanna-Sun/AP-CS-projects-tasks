import java.util.Scanner;

public class AverageTen {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double sum = 0;
    double index = 0;
    double result;
    while (index < 10) {
      sum = sum + scanner.nextDouble();
      index += 1;
    }
    result = sum/10;
    System.out.println("The average of above 10 numbers is" + result);
  }
}
