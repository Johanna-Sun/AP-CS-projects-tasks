import images.APImage;




 import images.Pixel;



 import java.util.Scanner;
 import javax.swing.*;
  import java.awt.*;
  import java.util.Random;




public class classTest{
   public static void main(String[]args){
JFrame theGUI = new JFrame();


      theGUI.setTitle("GUI Example");

       String inputStr = JOptionPane.showInputDialog("Number of rows", "5");

       if (inputStr == null) return;

       int rows = Integer.parseInt(inputStr);

       inputStr = JOptionPane.showInputDialog("Number of columns", "5");

       if (inputStr == null) return;

       int cols = Integer.parseInt(inputStr);

       //theGUI.setSize(cols  * 50, rows * 50);

  theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       Container pane = theGUI.getContentPane();

        pane.setLayout(new GridLayout(rows, cols));
       Random gen = new Random();
       for (int i = 1;i <= rows * cols;i++){
         int red = gen.nextInt(256);
          int green = gen.nextInt(256);
          int blue = gen.nextInt(256);
          Color backColor = new Color(red, green, blue);
          //Use new constructor to specify the preferred size of the panel
          ColorPanel panel = new ColorPanel(backColor, 50, 50);
            pane.add(panel);

      }       theGUI.pack();
                            //Added!!
                            theGUI.setVisible(true);


}
}
