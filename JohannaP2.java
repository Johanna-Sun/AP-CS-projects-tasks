
/*


Johanna Sun
P2


*/



import java.util.Scanner;

public class JohannaP2 {

  public static void main(String[] args) {
    double index;
    index = 1;
    doSomething(index);

  }

  public static void doSomething(double currentIndex){

    Scanner employee = new Scanner (System.in);
    double basePay;
    double hoursWorded;
    double result;
    double decision;
    double index2;
    String name = "employee";


    //enter the value
    System.out.println();
    System.out.print("enter the base pay: ");
    basePay = employee.nextDouble();
    System.out.print("enter the hours worked: ");
    hoursWorded = employee.nextDouble();

    //whether values are correct
    if (basePay <= 8 || hoursWorded >= 60) {
      System.out.print("error");
    } else {

      if (hoursWorded <= 40) {
        result = basePay * hoursWorded;
      } else {
        result = 40 * basePay + (hoursWorded - 40) * basePay * 1.5;
      }

      //print result
      System.out.print("employee" + currentIndex + ": " + result);
    }

  //enter new employee
  System.out.println();
  System.out.print("enter 1 to add another employee");
  decision = employee.nextDouble();

  //add the index of employee
  if (decision == 1) {
    addIndex(currentIndex);
  } else {
  System.out.print("quit");
    }


  }

  public static void addIndex (double nowIndex) {

    //kind of 递归（
    double index2 = nowIndex + 1;
    doSomething(index2);
  }

}






//
