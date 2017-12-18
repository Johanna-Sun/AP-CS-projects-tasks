/*********************************************************************
 * *
 * Johanna Sun 20190069
 * *
 * AP Computer Science Period 2
 * *
 * Starting Date: 2017.09.05          Due Date: 2017.09.08
 * *
 * This program will identify whose program listing it is through the
 * use of comments. It will also identify who the output belongs to
 * through the use of println statements.
 *********************************************************************/



import java.util.Scanner;

public class JohannaP2BinaryAndDecimal{

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      double decision;
      System.out.println();
      System.out.print("Enter 1 to convert binary to decimal or 2 to convert decimal to binary: \n");
      decision = sc.nextDouble();
      // convert binary to decimal
      if (decision == 1) {
        System.out.println();
        System.out.print("Enter your binary number: ");
        String inputBinary;
        inputBinary = sc.next();
        BinaryToDecimal(inputBinary);
      } else if (decision == 2) { //convert decimal to binary
        System.out.println();
        System.out.print("Enter your decimal number: ");
        int inputDecimal;
        inputDecimal = sc.nextInt();
        DecimalToBinary(inputDecimal);
      } else { //exist the program
        System.out.println("error. now exist this program.");
      }
    }

    //convert binary to decimal
    public static void BinaryToDecimal (String binaryCode) {
      int decimal = 0;
      int power = 0;
      while(binaryCode.length()>0) {
          int temp = Integer.parseInt(binaryCode.charAt((binaryCode.length())-1)+"");
          decimal += temp * Math.pow(2, power++);
          binaryCode = binaryCode.substring(0,binaryCode.length()-1);
        }
        System.out.println("The converted decimal code is: " + decimal);
    }

    //convert decimal to binary
    public static void DecimalToBinary (int decimalCode) {
      String binary = "";
      while(decimalCode > 0)
        {
            binary = (decimalCode%2)+binary;
            decimalCode = decimalCode/2;
        }
        System.out.println("The converted binary code is: " + binary);
    }

}














//
