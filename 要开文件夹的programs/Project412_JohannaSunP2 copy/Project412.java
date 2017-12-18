import javax.swing.*;
import java.awt.*;

public class Project412 {
  public static void main(String[] args) {
    String inputStr = JOptionPane.showInputDialog("Number of rows", "5");
    if (inputStr == null) return;
    int rows = Integer.parseInt(inputStr);
    inputStr = JOptionPane.showInputDialog("Number of columns", "5");
    if (inputStr == null) return;
    int cols = Integer.parseInt(inputStr);

    JFrame theGUI = new JFrame();
    // theGUI.setSize(160,160);
    theGUI.setTitle("GUI Program");
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container pane = theGUI.getContentPane();
    pane.setLayout(new GridLayout(rows, cols));

    for (int i = 1;i <= rows;i++) {
      for (int j = 1;j <= cols;j++ ) {
        if (i%2 == 0) {
          if (j%2 == 0) {
            pane.add(new ColorPanel(Color.red,50,50));
          } else {
            pane.add(new ColorPanel(Color.black,50,50));
          }
        } else {
          if (j%2 == 0) {
            pane.add(new ColorPanel(Color.black,50,50));
          } else {
            pane.add(new ColorPanel(Color.red,50,50));
          }
        }
      }
    }

    theGUI.pack();
    theGUI.setVisible(true);
  }
}
