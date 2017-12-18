import javax.swing.*;
import java.awt.*;

public class Project411 {
  public static void main(String[] args) {
    JFrame theGUI = new JFrame();
    // theGUI.setSize(160,160);
    theGUI.setTitle("GUI Program");

    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container pane = theGUI.getContentPane();
    pane.setLayout(new GridLayout(8, 8));

    for (int i = 1;i <= 8;i++) {
      for (int j = 1;j <= 8;j++ ) {
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
