import javax.swing.*;
import java.awt.*;

public class Project413 {
  public static void main(String[] args) {
    JFrame GUI = new JFrame();
    GUI.setTitle("Project 4-13");
    GUI.setSize(800,400);
    GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container pane = GUI.getContentPane();
    ColorPanel panel = new ColorPanel();
    pane.add(panel);
    GUI.setVisible(true);
  }


}
