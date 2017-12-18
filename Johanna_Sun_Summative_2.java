import java.util.Scanner;

public class Johanna_Sun_Summative_2 {
  public static void main(String[] args) {
    System.out.println("\n/*********************************************************************\n* *\n* Johanna Sun GJ20190069\n* *\n* AP Computer Science Java Period : 2\n* *\n* Starting Date: Nov 1,2017          Due Date:  Nov 3,2017\n* *\n* This program will identify whose program listing it is through the\n* use of comments. It will also identify who the output belongs to\n* through the use of println statements.\n*********************************************************************/");
    /*********************************************************************
    * *
    * Johanna Sun GJ20190069
    * *
    * AP Computer Science Java Period : 2
    * *
    * Starting Date: Nov 1,2017          Due Date:  Nov 3,2017
    * *
    * This program will identify whose program listing it is through the
    * use of comments. It will also identify who the output belongs to
    * through the use of println statements.
    *********************************************************************/
    System.out.println("\n/*********************************************************************\n* *                 Bank Account\n*                         copyright 2017-2018\n*                         programmer name class P2\n*\n* 	Purpose of this program: create a bank account and to deposit and to withdraw\n* *\n* 	Input:  client create their account balance/deposit/withdrawals\n* *\n* 		Parameters parse in:\n* *\n* 	Output: a bank acount containing name and balance\n* *\n*  		value returned\n*\n*********************************************************************/");
    /*********************************************************************
    * *                 Bank Account
    *                         copyright 2017-2018
    *                         programmer name class P2
    *
    * 	Purpose of this program: create a bank account and to deposit and to withdraw
    * *
    * 	Input:  client create their account balance/deposit/withdrawals
    * *
    * 		Parameters parse in:
    * *
    * 	Output: a bank acount containing name and balance
    * *
    *  		value returned
    *
    *********************************************************************/


    /*
      Now new a scanner and new the default bank account
      int two varaibles that will be used later
    */
    Scanner scanner = new Scanner(System.in);
    BankAccount account = new BankAccount();
    int answer = 0;
    int choice = -1;

    /*
      Print some sentences to remind clinet about entering basic information
      let the name and balance of account became client's data.
    */
    System.out.println("Now let's initialize your account!\nPlease enter your name: ");
    account.SetName(scanner.nextLine());
    System.out.println("Please enter your balance:");
    account.SetBalance(scanner.nextInt());

    /*
      Show the current bank account's information to client.
    */
    System.out.println("Wow! Here's your account: " + account.toString());

    /*
      let the clinet decide to continue or not
    */
    System.out.println("If you want to continue with your account information, please enter 0");
    choice = scanner.nextInt();

    /*
      while the client want to continue, it will should the following guide (1~5)
    */
    while (choice == 0) {
      /*
        show how to do different operations
      */
      System.out.println("Now decide what you want to do: \n[1] - deposit \n[2] - withdrawals \n[3] - show name \n[4] - show balance\n[5] - quit");
      /*
        let the answer to be the number that client enters(in order to do control statement later)
      */
      answer = scanner.nextInt();
      /*
        different number indicates different operations
        under each answer(1~5), there is diferent operations
        1 use add method(for deposit)
        2 use minus method(for withdrawals)
        3 and 4 use toString method
        5 quit
        meanwhile, the value of answer canbe change under each if statement, therefore it is not a infinite while loop :)
        client can do operation as many as they want
      */
      if (answer == 1) {
        choice = -1;
        System.out.println("Please enter your deposit: ");
        account.Add(scanner.nextDouble());
        System.out.println("Here's your latest account information: " + account.toString());
        System.out.println("If you want to continue, please enter 0");
        choice = scanner.nextInt();
      }
      if (answer == 2) {
        choice = -1;
        System.out.println("Please enter your withdrawals: ");
        account.Minus(scanner.nextDouble());
        System.out.println("Here's your latest account information: " + account.toString());
        System.out.println("If you want to continue, please enter 0");
        choice = scanner.nextInt();
      }
      if (answer == 3 || answer == 4) {
        choice = -1;
        System.out.println("Here's your latest account information: " + account.toString());
        System.out.println("If you want to continue, please enter 0");
        choice = scanner.nextInt();
      }
      if (answer == 5) {
        System.out.println("Now quit.");
        System.exit(0);
      }
    }
  }
}


/*
  a new class called BankAccount
  containing methods and object
*/
class BankAccount {

  /*
    set public variables
  */
  public String name;
  public double balance;

  /*
    create bankaccount object
  */
  public BankAccount(String n,double b) {
    name = n;
    balance = b;
  }

  /*
    default value of initial bankaccount
  */
  public BankAccount() {
    this.name = "default value, you should create a new one :)";
    this.balance = -1;
  }

  /*
      set name of the object
  */
  public void SetName(String n) {
    this.name = n;
  }

  /*
    set balance of the bankaccount
  */
  public void SetBalance(double b) {
    this.balance = b;
  }

  /*
    deposit
    return a new bank account (the balance of this account is updated)
  */
  public BankAccount Add(double deposit) {
    balance = balance + deposit;
    return new BankAccount(name,balance);
  }

  /*
      withdrawals
      return a new bank account (the balance of this account is updated)
  */
  public BankAccount Minus(double deposit) {
    balance = balance - deposit;
    return new BankAccount(name,balance);
  }

  /*
    return the value of the name
  */
  public String backName() {
    return name;
  }

  /*
      return the value of the balance
  */
  public double backBalance() {
    return balance;
  }

  /*
      override the toString method, therefore the client can see his/her name and balance
  */
  public String toString() {
    return "\nYour name is: " + name + ".\n" + "Your balance is: " + balance + ".";
  }
}
































//
