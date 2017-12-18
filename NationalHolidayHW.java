package draft;

import java.util.Scanner;
import java.io.*;

public class NationalHolidayHW {
	public static void main (String[]args) throws IOException{

		String Name [] = new String [500];
		String Account [] = new String [500];
		double BeginBalance [] = new double [500];
		double EndingBalance []=new double [500];
		int a=0,b=0,c=0;
		int count=0;

		Scanner reader = new Scanner (new File ("AccountData.txt"));
		for (int n = 0;reader.hasNextLine(); n ++) {
			String x= reader.nextLine();
			String []all = x.split(" ");

			if(n%3==1) {
				Account [a] =all[count];
				a++;
				count++;
			}

			if(n%3==2) {
				String x =all[count];
				BeginBalance[b] = parseFloat(all[count]);
				EndingBalance [b]= BeginBalance [b]*1.1;
				b++;
				count++;
			}

			if(n%3==0) {
				Name [c] =all[count];
				c++;
				n-=3;
				count++;
			}
		}

		PrintWriter writer = new PrintWriter (new File ("AccountReport.txt"));
		writer.println("Account    Owner        Beginning Balance       Ending Balance");

		for (int n = 0; n<=a; n++) {
			writer.println(Account[n]+ "     " +Name[n] +"      $"+ BeginBalance[n] +"     $" + EndingBalance[n]);
		}

		writer.close();
	}



}
