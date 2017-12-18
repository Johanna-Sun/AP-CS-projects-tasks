
import javax.swing.*;
 import java.awt.*;

public class ColorPanel extends JPanel{
   // Client provides color and preferred width and height
   public ColorPanel(){
     setBackground(Color.red);


   }
   public void paintComponent(Graphics g) {
       super.paintComponent(g);
       g.setColor(Color.black);
       g.fillRect(0, 0, 400, 400);
       g.setColor(Color.white);
       g.fillRect(400,0,400,400);
       g.setColor(Color.gray);
       g.fillRect(150, 150, 100, 100);
       g.setColor(Color.gray);
       g.fillRect(550, 150, 100, 100);
   }
   // Client provides color     // Preferred width and height are 0, 0 by default
 }
