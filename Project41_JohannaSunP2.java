import java.util.Scanner;

public class Project41_JohannaSunP2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the first number no matter the size.");
    int n1 = scanner.nextInt();
    System.out.println("enter the second number no matter the size.");
    int n2 = scanner.nextInt();
    int left=0;
    int i = 0;
    int totalLeft = n1;
    if (n1 > n2) {
      left = n1%n2;
      while (totalLeft != left) {
        totalLeft = n1 - n2*i;
        i += 1;
      }
    } else {
      left = n2%n1;
      while (totalLeft != left) {
        totalLeft = n2 - n1*i;
        i += 1;
      }
    }

    System.out.println("the quotient is:" + (i-1));
    System.out.println("the remiander is:" + left);
  }
}
