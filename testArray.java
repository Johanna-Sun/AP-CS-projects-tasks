import java.util.*;

public class testArray {

  public static void main(String[] args) {

    // double test = 5.0/3;
    // System.out.println(test);

    ArrayList<Integer> test = new ArrayList<Integer>();
    test.add(1);
    test.add(2);
    test.add(3);
    test.remove(0);
    test.set(0,9);
    System.out.println(test.get(0));

  }


}
