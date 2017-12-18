import java.util.Scanner;

public class Convert10To2Program {
  public static void main(String[] args) {
    int decimal;
    int rem;
    double sum = 0;
    int index = 0;
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter your decimal number: ");
    decimal = scanner.nextInt();
    while (decimal > 0) {
      rem = decimal % 2;
      sum = sum + (double)rem * Math.pow(10,index);
      index += 1;
      decimal = decimal / 2;
    }
    int result = (int)sum * (int)Math.pow(10,index-1);
    System.out.println(sum);
  }
}
