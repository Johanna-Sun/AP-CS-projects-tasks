import images.APImage;
import images.Pixel;
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.awt.*;

   public class Project51{
   public static void main(String[]args){
     Scanner reader = new Scanner(System.in);
     Random random = new Random();
      APImage image = new APImage("smokey.jpg");
       image.draw();
       int red1 = random.nextInt(256);
       int green1 = random.nextInt(256);
       int blue1 = random.nextInt(256);
       Color color1 = new Color(red1, green1, blue1);
       int red2 = random.nextInt(256);
       int green2 = random.nextInt(256);
       int blue2 = random.nextInt(256);
       Color color2 = new Color(red2, green2, blue2);

      for (Pixel p : image){
         int red = p.getRed();

         int green = p.getGreen();

         int blue = p.getBlue();

         int average = (red + green + blue) / 3;
          if (average < 128){
            p.setRed(red1);
             p.setGreen(green1);
             p.setBlue(blue1);


         }else{
              p.setRed(red2);
             p.setGreen(green2);
             p.setBlue(blue2);
          }
         }
         System.out.print("Press return to continue:");

         reader.nextLine();

         image.draw();

      }
   }
