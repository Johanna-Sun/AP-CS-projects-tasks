import java.util.*;

public class Project4JohannaSun {
  public static Scanner scanner = new Scanner(System.in);
  public static List<Library> libraries = new ArrayList<Library>();
  // choice is the serial number of 3 operations
  // amount indicates the amount of students in student grade book currently
  public static int choice;
  public static int flag = 0;

  // enteredName is the name of student that client look for in the student grade book
  public static String enteredName;


  public static void main(String[] args) {
    System.out.println("\n/********************************************************************* \n* * \n* Johanna Sun; GJ20190069                           \n* * \n* AP Computer Science Java Period: 2\n* * \n* Starting Date:  Dec 19, 2017          Due Date:  Dec 19, 2017\n* * \n* This program will identify whose program listing it is through the \n* use of comments. It will also identify who the output belongs to\n* through the use of println statements. \n*********************************************************************/");

    /*********************************************************************
    * *
    * Johanna Sun; GJ20190069
    * *
    * AP Computer Science Java Period: 2
    * *
    * Starting Date:  Dec 19, 2017          Due Date:  Dec 19, 2017
    * *
    * This program will identify whose program listing it is through the
    * use of comments. It will also identify who the output belongs to
    * through the use of println statements.
    *********************************************************************/

System.out.println("\n********************************************************************* \n* *                       NumberConvertSystem\n*                         copyright 2017-2018\n*                         programmer name class P2\n*\n* 	Purpose of this program: create 2 libraries people can borrow books               \n* * \n* 	Input:  library's address, book's title\n* * \n* 		Parameters parse in:\n* *\n* 	Output: whether book is borrowed, library's time and address\n* *\n*  		value returned\n* \n*********************************************************************/");

/*********************************************************************
 * *                       NumberConvertSystem
  *                         copyright 2017-2018
 *                         programmer name class P2
 *
 * 	Purpose of this program: create 2 libraries people can borrow books
 * *
 * 	Input:  library's address, book's title
 * *
 * 		Parameters parse in:
 * *
 * 	Output: whether book is borrowed, library's time and address
 * *
 *  		value returned
 *
 *********************************************************************/


    Book.main(args);

    scanner.useDelimiter("\n");

    //initialize
    // Create two libraries
    Library firstLibrary = new Library("10 Main St.");
    Library secondLibrary = new Library("228 Liberty St.");

    // Add four books to the first library
    firstLibrary.addBook(new Book("The Da Vinci Code"));
    firstLibrary.addBook(new Book("Le Petit Prince"));
    firstLibrary.addBook(new Book("A Tale of Two Cities"));
    firstLibrary.addBook(new Book("The Lord of the Rings"));

    // Print opening hours and the addresses
    System.out.println("Library hours:");
    printOpeningHours();
    System.out.println();
    System.out.println("Library addresses:");
    firstLibrary.printAddress();
    secondLibrary.printAddress();
    System.out.println();

    // Try to borrow The Lords of the Rings from both libraries
    System.out.println("Borrowing The Lord of the Rings:");
    firstLibrary.borrowBook("The Lord of the Rings");
    firstLibrary.borrowBook("The Lord of the Rings");
    secondLibrary.borrowBook("The Lord of the Rings");
    System.out.println();

    // Print the titles of all available books from both libraries
    System.out.println("Books available in the first library:");
    firstLibrary.printAvailableBooks();
    System.out.println();
    System.out.println("Books available in the second library:");
    secondLibrary.printAvailableBooks();
    System.out.println();

    libraries.add(firstLibrary);
    libraries.add(secondLibrary);


    Choice();

    while (choice != 7) {

      if (choice == 1) {
        for (int i = 0;i < libraries.size() ;i++ ) {
          System.out.println("The " + (i+1) + " library's address is: \n" + libraries.get(i).getAddress());
        }
        libraries.get(0).getTime();
        Choice();
      }

      if (choice == 2) {
        flag = 0;
        System.out.println("Enter the address of the library");
        String n = scanner.next();
        for (int i=0;i<libraries.size();i++) {
          if (libraries.get(i).getAddress().equals(n)) {
            flag = 1;
            System.out.println("Enter the name of the book: ");
            String t = scanner.next();
            libraries.get(i).addBook(new Book(t));
          }
        }
        if (flag == 0) {
          System.out.println("oops! you may enter a wrong name of the library, try again or do another operation");
        }
        Choice();
      }

      if (choice == 3) {
        flag = 0;
        System.out.println("Enter the address of the library");
        String n = scanner.next();
        for (int i=0;i<libraries.size();i++) {
          if (libraries.get(i).getAddress().equals(n)) {
            flag = 1;
            System.out.println("Enter the name of the book: ");
            libraries.get(i).removeBook(scanner.next());
          }
        }
        if (flag == 0) {
          System.out.println("oops! you may enter a wrong name of the library, try again or do another operation");
        }
        Choice();
      }

      if (choice == 4) {
        flag = 0;
        System.out.println("Enter the address of the library");
        String n = scanner.next();
        for (int i=0;i<libraries.size();i++) {
          if (libraries.get(i).getAddress().equals(n)) {
            flag = 1;
            System.out.println("Enter the name of the book: ");
            String answer = scanner.next();
            if (libraries.get(i).findBook(answer).isBorrowed() == true) {
              System.out.println("This book is not avaliable or is borrowed, please change one or do another operation");
            } else {
              libraries.get(i).borrowBook(answer);
              System.out.println("you have successfully borrowed this book!");
            }
          }
        }
        if (flag == 0) {
          System.out.println("oops! you may enter a wrong name of the library, try again or do another operation");
        }
        Choice();
      }

      if (choice == 5) {
        flag = 0;
        System.out.println("Enter the address of the library");
        String n = scanner.next();
        for (int i=0;i<libraries.size();i++) {
          if (libraries.get(i).getAddress().equals(n)) {
            flag = 1;
            System.out.println("Enter the name of the book: ");
            libraries.get(i).returnBook(scanner.next());
            System.out.println("you have successfully returned this book!");
          }
        }
        if (flag == 0) {
          System.out.println("oops! you may enter a wrong name of the library, try again or do another operation");
        }
        Choice();
      }

      if (choice == 6) {
        flag = 0;
        System.out.println("Enter the address of the library");
        String n = scanner.next();
        for (int i=0;i<libraries.size();i++) {
          if (libraries.get(i).getAddress().equals(n)) {
            flag = 1;
            System.out.println("Enter the name of the book: ");
            System.out.println(libraries.get(i).checkStatus(scanner.next()));
          }
        }
        if (flag == 0) {
          System.out.println("oops! you may enter a wrong name of the library, try again or do another operation");
        }
        Choice();
      }

    }


  }

  //choice explianation

  public static int Choice() {
    System.out.println("The system now have " + libraries.size() + " libraries. Please select the option you want to make: ");
    System.out.println("[1] - Print libraries' addresses and time");
    System.out.println("[2] - Add a book in a library");
    System.out.println("[3] - Delete a book in a library");
    System.out.println("[4] - Borrow a book in a library");
    System.out.println("[5] - Return a book in a library");
    System.out.println("[6] - Check the status of a book in a library");
    System.out.println("[7] - Exit the system");

    // set the value of choice as client's input
    choice = scanner.nextInt();

    //return the value of choice(to update)
    return choice;
  }

//pirint the opening hours of Libraries

  public static void printOpeningHours() {
    System.out.println("Libraries are open daily from 9am to 5pm.");
  }
}

class Library {
  /*********************************************************************
 * *                       Function name
  *
 * * 	Purpose: creae library ….            ……
 * *
 * 	Input:  library address……..
 * *
 * 		Parameters parse in:
 * *
 * 	Output:
 * *          list of books
 *
 *
 *********************************************************************/
  List<Book> books = new ArrayList<Book>();
  String time = "Libraries are open daily from 9am to 5pm.";
  String address;

  public Library() {
    this.address = "this is defalut setting, you should not see this. Please initialize your library.";
  }

  public Library(String a) {
    this.address = a;
  }

  public void printAvailableBooks() {
    for (int i=0;i<books.size();i++) {
      System.out.println(books.get(i).getTitle());
    }
  }

  public void printAddress() {
    System.out.println(address);
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void removeBook(String t) {
    Iterator<Book> sListIterator = books.iterator();
    while(sListIterator.hasNext()){
      String currentTitle = sListIterator.next().getTitle();
      if(currentTitle.equals(t)){
        sListIterator.remove();
      }
    }
  }

  public void borrowBook(String t) {
    for (int i=0;i<books.size();i++) {
      if (books.get(i).getTitle().equals(t)) {
        books.get(i).borrowed();
        break;
      }
    }
  }

  public void returnBook(String t) {
    for (int i=0;i<books.size();i++) {
      if (books.get(i).getTitle().equals(t)) {
        books.get(i).returned();
        break;
      }
    }
  }

  public String checkStatus(String t) {
    for (int i=0;i<books.size();i++) {
      if (books.get(i).getTitle().equals(t)) {
        if (books.get(i).isBorrowed() == true) {
          return "This book is borrowed";
        } else {
          return "This book is not borrowed";
        }
      }
    }
    return "This book is not in this library, try another book or library.";
  }

  public Book findBook(String t) {
    for (int i=0;i<books.size();i++) {
      if (books.get(i).getTitle().equals(t)) {
        return books.get(i);
      }
    }
    return (new Book());
  }

  public String getTime() {
    return time;
  }

  public String getAddress() {
    return address;
  }

}











/*********************************************************************
 * *                       BOOK
  *
 * * 	Purpose: …. create book and their status           ……
 * *
 * 	Input:  book title
 * *
 * 		Parameters parse in:
 * *
 * 	Output:
 * *          title and status
 *
 *********************************************************************/

class Book {
  String title;
  boolean status; //returned = false; borrowed = true;

  public static void main(String[] arguments) {

    // Small test of the Book class
    Book example = new Book("The Da Vinci Code");

    System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
    System.out.println("Borrowed? (should be false): " + example.isBorrowed());

    example.borrowed();

    System.out.println("Borrowed? (should be true): " + example.isBorrowed());
    example.returned();
    System.out.println("Borrowed? (should be false): " + example.isBorrowed());

  }

  public Book() {
    this.title = "this is defalut setting, you should not see this. Please initialize your book.";
    this.status = true;
  }

  // Creates a new Book
  public Book(String bookTitle) {
    this.title = bookTitle;
    this.status = false;
  }

  // Marks the book as rented
  public void borrowed() {
    this.status = true;
  }

  // Marks the book as not rented
  public void returned() {
    this.status = false;
  }

  // Returns true if the book is rented, false otherwise
  public boolean isBorrowed() {
    return status;
  }

  // Returns the title of the book
  public String getTitle() {
    return title;
  }

}

















//
