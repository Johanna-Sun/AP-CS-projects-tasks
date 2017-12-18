import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Account {
  public static void main(String[] args) throws FileNotFoundException {

    DecimalFormat df = new DecimalFormat("######0.00");
    Scanner scanner =  new Scanner(new FileReader("AccountData.txt"));
    PrintWriter writer = new PrintWriter(new File("AccountReport.txt"));
    List<Integer> account = new ArrayList<Integer>();
    List<Double> beginningBalance = new ArrayList<Double>();
    List<Double> endingBalance = new ArrayList<Double>();
    List<String> name = new ArrayList<String>();

    while (scanner.hasNext()) {
       String[] divided = scanner.nextLine().split(" ");
       account.add(Integer.parseInt(divided[0]));
       beginningBalance.add(Double.parseDouble(divided[1]));
       if (divided.length == 3) {
         name.add(divided[2]);
       } else {
         name.add(divided[2] + " " + divided[3]);
       }
    }

    scanner.close();

    writer.println("Account,Ownner,BeginningBalance,Ending Balance");
    for (int i = 0; i < name.size() ; i++ ) {
      endingBalance.add(Double.parseDouble(df.format(beginningBalance.get(i) * 1.1)));
      writer.println(account.get(i) + "," + name.get(i) + "," + beginningBalance.get(i) + "," + endingBalance.get(i));
    }

    writer.close();


  }

}
