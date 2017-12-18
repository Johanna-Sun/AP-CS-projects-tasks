import java.util.Scanner;

public class Convert2To10Program {
  public static void main(String[] args) {
    int binary;
    int index = 0;
    int rem;
    int sum = 0;
    Scanner scanner =  new Scanner (System.in);
    System.out.println("Enter your binary number: ");
    binary = scanner.nextInt();
    while (binary > 0) {
       rem = binary % 10;
       sum = sum + (int)Math.pow(2,index) * rem;
       binary = binary / 10;
       index ++;
    }
    System.out.println("The decimal number is: " + sum);
  }
}
