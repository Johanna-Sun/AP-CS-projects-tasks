import java.util.*;

public class testArray {

  public static void main(String[] args) {

    // double test = 5.0/3;
    // System.out.println(test);

    int num = 12345;
    String num2 = Integer.toString(num);
    System.out.println(num2.split(""));
    for (String element :num2 ) {
      System.out.println(element);
    }

  }


}
