import java.io.*;
import java.util.*;

public class JohannaSunSummativeProject {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n/*********************************************************************\n* *\n* Johanna Sun GJ20190069\n* *\n* AP Computer Science Java Period : \n2* *\n* Starting Date: Sep 26,2017          Due Date:  Sep 29,2017\n* *\n* This program will identify whose program listing it is through the\n* use of comments. It will also identify who the output belongs to\n* through the use of println statements.\n*********************************************************************/");
        /*********************************************************************
        * *
        * Johanna Sun GJ20190069
        * *
        * AP Computer Science Java Period :
        2* *
        * Starting Date: Sep 26,2017          Due Date:  Sep 29,2017
        * *
        * This program will identify whose program listing it is through the
        * use of comments. It will also identify who the output belongs to
        * through the use of println statements.
        *********************************************************************/
        System.out.println("/********************************************************************* \n * *                      The first fastest runner and the second fastest runner\n  *                         copyright 2017-2018\n *                         programmer name class P2\n *\n * 	Purpose of this program: to find the first fastest runner and the second fastest runner                 \n * * \n * 	Input:  a file contains the data of the name of runners and the time\n * * \n * 		Parameters parse in:\n * *\n * 	Output: a file that contains the time and names of the first fastest and the second fastes runner\n * *\n *  		value returned\n * \n *********************************************************************/");

 /*********************************************************************
* *                      The first fastest runner and the second fastest runner
*                         copyright 2017-2018
*                         programmer name class P2
*
* 	Purpose of this program: to find the first fastest runner and the second fastest runner
* *
* 	Input:  a file contains the data of the name of runners and the time
* *
* 		Parameters parse in:
* *
* 	Output: a file that contains the time and names of the first fastest and the second fastes runner
* *
*  		value returned
*
*********************************************************************/

        /*  Here I create 4 lists for use.
          1 represents the lists that are used for choosing the first fastest runner;
          2 represents the lists that are used for choosing the second fastest runner;
        */
        List<String> name1 = new ArrayList<String>();
        List<Integer> time1 = new ArrayList<Integer>();
        List<String> name2 = new ArrayList<String>();
        List<Integer> time2 = new ArrayList<Integer>();

        /*
          Here I add the information on txt to name1 and time 1
          use condition in while loop to determine whether these's still information left
          open the input file and output file
        */
        Scanner scanner = new Scanner(new FileReader("Project.txt"));
        PrintWriter writer = new PrintWriter(new File("Rank.txt"));
        // int test = scanner.nextInt();
        // System.out.println(test);
        while (scanner.hasNext()) {
          name1.add(scanner.next());
          time1.add(scanner.nextInt());
        }
        /*
          close the scanner to save storage;
        */
        scanner.close();

        /*
          define integer flag and initialize its value = 0;
          define integer min and initialize its value equals to the first number in the time1 list;
        */
        int flag = 0;
        int min = time1.get(0);

        /*
          use for loop to check all the integers in time1
          compare two values
          use min to save the smaller values
          and then use min to compare the third value and so on
          use flag to mark the index of the current smallest value
        */
        for (int i = 0; i < time1.size(); i++) {
          if (time1.get(i) <= min) {
            flag = i;
            min = time1.get(i);
          }
        }

        /*
          because the index of time1 and name1 are the same
          the index of the smallest value in time1-list is accord with in name1-list
          therefore name1.get(flag)will fetch the name of the fastest runner
          enter the data into the file
        */
        System.out.println("The fastest runner and the time: ");
        System.out.println(name1.get(flag) + "   " + min);
        writer.println("The fastest runner and the time: ");
        writer.println(name1.get(flag) + "   " + min);

        /*
          add the name and time in name1 and time1 to name2 and time2
          but delete the fastest runner's name and time
        */
        for (int i = 0; i < name1.size(); i++) {
          if (name1.get(i) != name1.get(flag)) {
            name2.add(name1.get(i));
            time2.add(time1.get(i));
          }
        }

        /*
          finding the minimum value in time2
          because the actual minimum value in originial list is deleted
          therefore the smallest value in time2 indeed is the second smallest value
        */
        for (int i = 0; i < time2.size(); i++) {
          if (time1.get(i) <= min) {
            flag = i;
            min = time2.get(i);
          }
        }

        /*
          output the data and enter the file about the second fastest runner
        */
        System.out.println("The second fastest runner and the time: ");
        System.out.println(name2.get(flag) + "   " + min);
        writer.println("The second fastest runner and the time: ");
        writer.println(name2.get(flag) + "   " + min);

        /*
          close the output file to save the storage
        */
        writer.close();


        }

}
