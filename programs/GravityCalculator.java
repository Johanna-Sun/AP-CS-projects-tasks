/**
 *
 * @author ryanzhang
 *
 */
import java.util.*;
public class JAVA大爷行行好 {

/**
 *
 * @param args
 */

	public static void main(String[] args) {

		/*
		TODO Auto-generated method stub*/
		// main is a entering method? A function?

		int p;
		p = 1;
		System.out.println(p);
		int p2 = 10;
		System.out.println("p2 = " + p2);

		byte t=127;
		System.out.println("t = " + t);

		double gravity=9.81;
		double initialvelocity=0.0;
		double fallingtime=10.0;
		double initialposition=0.0;
		double finalposition=10.0;
		System.out.println("The object's position after "+fallingtime+" second is "+finalposition+" m.");
		double l=(finalposition-initialposition)/fallingtime;
		System.out.println("The object's average velocity = "+l+" m/s");

		float maxF=Float.MAX_VALUE;
		System.out.println("float的最大值是 "+maxF);
        /**
         *
         */
		String a1 ="JAVA爸爸";
		System.out.println(a1);

		Scanner s = new Scanner (System.in) ;
		System.out.println("Please enter your password.");
		String password=s.nextLine();
		if (password=="1234567890") {
			System.out.println("You have successfully logged in the system.");
	        }else {
				System.out.println("Your password is wrong.");
	        }




/**
 * I love computer science.
 */
	}

}
