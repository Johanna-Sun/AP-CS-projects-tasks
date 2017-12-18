public class Calculate100 {
  public static void main(String[] args) {
    int sum = 0, counter = 1;
    while (counter <= 100) {
      sum += counter;
      counter += 1;
    }
    System.out.println();
    System.out.print(sum);
  }
}
