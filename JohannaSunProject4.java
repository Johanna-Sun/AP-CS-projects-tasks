import java.util.*;

public class JohannaSunProject4 {

  public static Scanner scanner = new Scanner(System.in);
  public static List<Library> libraries = new ArrayList<Library>();
  // choice is the serial number of 3 operations
  // amount indicates the amount of students in student grade book currently
  public static int choice;

  // enteredName is the name of student that client look for in the student grade book
  public static String enteredName;


  public static void main(String[] args) {

    //initialize
    Library firstLibrary = new Library("10 Main St.");
    firstLibrary.addBook(new Book("The Da Vinci Code"));
    libraries.add(firstLibrary);

    Library secondLibrary = new Library("228 Liberty St.");
    secondLibrary.addBook(new Book("The Da Vinci Code"));
    libraries.add(secondLibrary);

    Choice();

    while (choice != 8) {
      if (choice == 1) {
        System.out.println("Please enter the address of the library: ");
        libraries.add(new Library(scanner.next()));
        Choice();
      }
    }

  }

  public static int Choice() {
    System.out.println("The system now have " + libraries.size() + " libraries. Please select the option you want to make: ");
    System.out.println("[1] - Add a library");
    System.out.println("[2] - Delete a library");
    System.out.println("[3] - Add a book in a library");
    System.out.println("[4] - Delete a book in a library");
    System.out.println("[5] - Borrow a book in a library");
    System.out.println("[6] - Return a book in a library");
    System.out.println("[7] - Check the status of a book in a library");
    System.out.println("[7] - Exit the system");

    // set the value of choice as client's input
    choice = scanner.nextInt();

    //return the value of choice(to update)
    return choice;
  }
}

class Book {
  String title;
	boolean status; //returned = false; borrowed = true;

  public Book() {
    this.title = "this is defalut setting, you should not see this. Please initialize your book.";
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

class Library {
  List<Book> books = new ArrayList<Book>();
  String time = "Libraries are open daily from 9am to 5pm.";
  String address;

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

  public String getTime() {
    return time;
  }

  public String getAddress() {
    return address;
  }

}

















//
