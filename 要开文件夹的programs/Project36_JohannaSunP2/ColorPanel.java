import javax.swing.*;

 import java.awt.*;


public class ColorPanel extends JPanel{
   public ColorPanel(Color backColor){
     setBackground(backColor);


   }

    public void paintComponent(Graphics g){
      super.paintComponent(g);

      g.drawLine(40, 55, 70, 25);
      g.drawLine(40,55,70,85);
      g.drawLine(40,55,230,55);
      g.drawLine(230,55,200,25);
      g.drawLine(230,55,200,85);

      g.drawLine(10,90,40,120);
      g.drawLine(40,120,10,150);
      g.drawLine(40,120,230,120);
      g.drawLine(230,120,260,90);
      g.drawLine(230,120,260,150);

      }
}
