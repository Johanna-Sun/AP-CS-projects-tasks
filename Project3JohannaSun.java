import java.util.*;

public class Project3JohannaSun {

  // define public static variables

  // choice is the serial number of 3 operations
  // amount indicates the amount of students in student grade book currently
  public static int choice,amount;

  // enteredName is the name of student that client look for in the student grade book
  public static String enteredName;

  // define scanner
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("/*********************************************************************\n* *\n* Johanna Sun GJ20190069\n* *\n* AP Computer Science Java Period : 2\n* *\n* Starting Date: Nov 20,2017          Due Date:  Nov 28,2017\n* *\n* This program will identify whose program listing it is through the\n* use of comments. It will also identify who the output belongs to\n* through the use of println statements.\n*********************************************************************/");
    /*********************************************************************
    * *
    * Johanna Sun GJ20190069
    * *
    * AP Computer Science Java Period : 2
    * *
    * Starting Date: Nov 20,2017          Due Date:  Nov 28,2017
    * *
    * This program will identify whose program listing it is through the
    * use of comments. It will also identify who the output belongs to
    * through the use of println statements.
    *********************************************************************/

    System.out.println("/*********************************************************************\n* *                 Bank Account\n*                         copyright 2017-2018\n*                         programmer name class P2\n*\n* 	Purpose of this program: create a student grade book and to display and to add new students\n* *\n* 	Input:  client create their students\n* *\n* 		Parameters parse in:\n* *\n* 	Output: student's name, five subjects and scores, grade leve(A~F)\n* *\n*  		value returned\n*\n*********************************************************************/");
    /*********************************************************************
    * *                 Bank Account
    *                         copyright 2017-2018
    *                         programmer name class P2
    *
    * 	Purpose of this program: create a student grade book and to display and to add new students
    * *
    * 	Input:  client create their students
    * *
    * 		Parameters parse in:
    * *
    * 	Output: student's name, five subjects and scores, grade leve(A~F)
    * *
    *  		value returned
    *
    *********************************************************************/


    // create arraylist because it does not need to initialize length, which means client can add as many student as they want.
    // the type of element in StudentList is Student, which is define later in the class
     List<Student> StudentList = new ArrayList<Student>();


     // create three students' information
     // add them into StudentList
     Student bill = new Student("Bill");
     bill.Subjects(0,"Math",93,95,90);
     bill.Subjects(1,"English",40,60,50);
     bill.Subjects(2,"CS",85,80,89);
     bill.Subjects(3,"Chemisry",70,80,75);
     bill.Subjects(4,"Economic",60,65,70);
     StudentList.add(bill);
     Student kelly = new Student("Kelly");
     kelly.Subjects(0,"Math",95,95,95);
     kelly.Subjects(1,"English",80,85,90);
     kelly.Subjects(2,"CS",85,80,90);
     kelly.Subjects(3,"Chemisry",70,80,75);
     kelly.Subjects(4,"Economic",79,81,85);
     StudentList.add(kelly);
     Student gary = new Student("Gary");
     gary.Subjects(0,"Math",93,95,90);
     gary.Subjects(1,"English",40,60,50);
     gary.Subjects(2,"CS",85,80,90);
     gary.Subjects(3,"Chemisry",70,80,75);
     gary.Subjects(4,"Economic",60,65,70);
     StudentList.add(gary);

     // update the amount of StudentList
     amount = StudentList.size();

     // call the Choice method
     Choice();

     //while the client does not choose 3(which means he/she does not want to exit the system)
     while (choice != 3) {


       // choice equals to one means the client want to add student into the student grade book
       if (choice == 1) {

         // let the client enter the name of student and new a student usint client's input
         System.out.println("\nEnter the student's name: ");
         Student student = new Student(scanner.next());

         // let the client enter five subjects and test score 1 & 2 & 3 one by one
         System.out.println("Enter the student's five subjects one by one with their tests' scores.\nThe 5 subjects can be choice from Computer science, English, Mathematics, Chemistry, Biology, Physic, Economic, or possible others.\nFor example: \nEnglish\n50\n90\n20\nMath\n100\n80\n70");

         // use for loop to control the total amount of subjects client input
         for (int i = 0;i<5;i++) {
           System.out.println("\nAdd a subject:\n");
           student.Subjects(i,scanner.next(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
         }

         // now the information of this new student object has been initialized, so add this student into StudentList(sutdent grade book)
         StudentList.add(student);

         // update amount
         amount = StudentList.size();

         // call the Choice method so that the client can continue to do operations if he/she wants
         Choice();
       }

       // choice equals to two indicates the client want to check student's information
       if (choice == 2) {

         // let the client input the name of student he/she is looking for
         System.out.println("\nEnter the name of student you are looking for: ");

         // use the input as the value of enteredName
         enteredName = scanner.next();

         // define the flag to estimate whether the system has found the student later
         int flag = 0;

         // use for loop to go over all students' names in StudentList
         for (int i=0;i < StudentList.size(); i++) {

           // if the enteredName equals to any student's name in the StudentList, continue operation
           if (enteredName.equals(StudentList.get(i).GetName()) == true) {

             // let the value of flag becomes 1, which means the system has found the student
             flag = 1;
             System.out.println("The system have found the student. \nHere's " + StudentList.get(i).GetName() + "'s information: ");

             // use two for loop to go over and print all information about the student
             // the reason that using for loop is that the informaiton of each student is sotred in two demension array
             for (int j=0;j<5;j++ ) {
               System.out.println("\nNow it's " + StudentList.get(i).GetName() + "'s information of the " + (j+1) + "th subject(" + StudentList.get(i).Read(j,0) + ")");
               for (int k = 1;k < 6;k++) {
                 if (k == 1) {
                   System.out.println(StudentList.get(i).GetName() + "'s first test score is: " + StudentList.get(i).Read(j,k));
                 }
                 if (k == 2) {
                   System.out.println(StudentList.get(i).GetName() + "'s second test score is: " + StudentList.get(i).Read(j,k));
                 }
                 if (k == 3) {
                   System.out.println(StudentList.get(i).GetName() + "'s final test score is: " + StudentList.get(i).Read(j,k));
                 }
                 if (k == 4) {
                   System.out.println(StudentList.get(i).GetName() + "'s average test score is: " + StudentList.get(i).Read(j,k));
                 }
                 if (k == 5) {
                   System.out.println(StudentList.get(i).GetName() + "'s grade level is: " + StudentList.get(i).Read(j,k));
                 }
               }
             }
             // since the system has found the student
             // out of the for loop because there's no need for cintinueing looking for student
             break;
           }
         }

         // if the value of flag is never changed from 0
         // this means the system never found the studnet
         // print infomration to remind client
         if (flag == 0) {
           System.out.println("Sorry, the system cannot find this student.");
         }

         // call the Choice method so that the client can continue to do operations if he/she wants
         Choice();
       }
     }

   }

   //  Choice
   // this method containning informaiton of the functions of each operaion(1 & 2 & 3)
   // and return the value of choice to update

   public static int Choice() {
     System.out.println("\nThe System now have " + amount + " students.\n(warning: this student grade book is up to 20 students. But you are free to add more than 20 students if it's necessary)\nPlease choose what you would like to do:");
     System.out.println("[1] - Add Student");
     System.out.println("[2] - Check Student Information");
     System.out.println("[3] - Exit System");

     // set the value of choice as client's input
     choice = scanner.nextInt();

     //return the value of choice(to update)
     return choice;
   }
}




/*********************************************************************
 * *                       class Student
  *
 * * 	Purpose:   create a student class containing students' information
 * *
 * 	Input:  test score 1 & 2 & 3, student's name
 * *
 * 		Parameters parse in:
 * *
 * 	Output: student object
 * *          any return data
 *
 *
 *********************************************************************/



class Student {

  // define the name as String
  public String name;

  // create two demension array to store the information of student
  public String grade[][] = new String[5][6];
  /*
  {
    {subject-1,score-1-1,score-1-2,score-1-3,socre-1-final,grade level-1}
    {subject-2,score-2-1,score-2-2,score-2-3,socre-2-final,grade level-2}
    {subject-3,score-3-1,score-3-2,score-3-3,socre-3-final,grade level-3}
    {subject-4,score-4-1,score-4-2,score-4-3,socre-4-final,grade level-4}
    {subject-5,score-5-1,score-5-2,score-5-3,socre-5-final,grade level-5}
  }
  */

  // set the default value of student
  public Student() {
    this.name = "this is default value, you should not see this.";
  }

  //set the name of the student
  public Student(String n){
    this.name = n;
  }

  //set the scores of each subject for student
  //the value of rank will be the i or j or k in the for loop
  public void Subjects(int rank, String s, double t1, double t2, double t3) {
    this.grade[rank][0] = s;
    this.grade[rank][1] = Double.toString(t1);
    this.grade[rank][2] = Double.toString(t2);
    this.grade[rank][3] = Double.toString(t3);

    // the value of final score is automatically calculated
    this.grade[rank][4] = Double.toString(0.3*t1 + 0.3*t2 + 0.4*t3);

    // use the value of final score to estimate grade leve(A~F)
    if ((0.3*t1 + 0.3*t2 + 0.4*t3) >= 90) {
      this.grade[rank][5] = "A";
    } else {
      if ((0.3*t1 + 0.3*t2 + 0.4*t3) >= 80) {
        this.grade[rank][5] = "B";
      } else {
        if ((0.3*t1 + 0.3*t2 + 0.4*t3) >= 70) {
          this.grade[rank][5] = "C";
        } else {
          if ((0.3*t1 + 0.3*t2 + 0.4*t3) >= 60) {
            this.grade[rank][5] = "D";
          } else {
            this.grade[rank][5] = "F";
          }
        }
      }
    }
  }

  // fetch information from the two demension array
  public String Read(int i, int j) {
    return grade[i][j];
  }

  // fetch the sutdent's name
  public String GetName() {
    return name;
  }


}
