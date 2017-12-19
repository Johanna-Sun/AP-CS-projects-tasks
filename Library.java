import java.util.*;

class Library {
  List<Book> books = new ArrayList<Book>();
  String time = "Libraries are open daily from 9am to 5pm.";
  String address;
  public static Scanner scanner = new Scanner(System.in);
  public static List<Library> libraries = new ArrayList<Library>();
  // choice is the serial number of 3 operations
  // amount indicates the amount of students in student grade book currently
  public static int choice;
  public static int flag = 0;

  // enteredName is the name of student that client look for in the student grade book
  public static String enteredName;


  public static void main(String[] args) {

    scanner.useDelimiter("\n");

    //initialize
    Library firstLibrary = new Library("10 Main St.");
    firstLibrary.addBook(new Book("The Da Vinci Code"));
    libraries.add(firstLibrary);

    Library secondLibrary = new Library("228 Liberty St.");
    secondLibrary.addBook(new Book("The Da Vinci Code"));
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

  public Library() {
    this.address = "this is defalut setting, you should not see this. Please initialize your library.";
  }

  public Library(String a) {
    this.address = a;
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


class Book {
  String title;
	boolean status; //returned = false; borrowed = true;

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
	   if (status == true) {
       return true;
     } else {
       return false;
     }
	}

	// Returns the title of the book
	public String getTitle() {
  	return title;
	}

}

















//
