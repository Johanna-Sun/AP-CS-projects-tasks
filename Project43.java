import java.util.Scanner;

public class Project43 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your minutes: ");
    int minute = scanner.nextInt();
    double cost = 1.15;
    if (minute < 2) {
      System.out.println("The cost is: " + cost);
    } else {
      cost = cost + (minute - 2)*0.5;
      System.out.println("The cost is: " + cost);
    }
  }
}
