import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNumber {
  public static void main(String[] args) throws FileNotFoundException{
    List<Integer> prime = new ArrayList<Integer>();
    Scanner scanner  =  new Scanner (new FileReader("Prime.txt"));
    PrintWriter writer = new PrintWriter(new File("newnumbers.txt"));
    int i  =  0;
    while (scanner.hasNext()) {
      prime.add(scanner.nextInt());
    }

    scanner.close();

    for (int j = 0; j < prime.size() ; j++ ) {
      int flag = 0;
      for(i = 2;i <= prime.get(j)/2;i++){
       if(prime.get(j)%i == 0){
       System.out.println(prime.get(j) + "Number is not prime");
       flag = 1;
       break;
       }
      }
      if(flag == 0) {
      writer.println(prime.get(j));
    }
    }

    writer.close();
  }

}
