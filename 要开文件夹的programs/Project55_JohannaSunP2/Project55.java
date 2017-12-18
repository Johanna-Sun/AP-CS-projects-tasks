import images.APImage;
import images.Pixel;
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.awt.*;

   public class Project55{
   public static void main(String[]args){
     Scanner reader = new Scanner(System.in);
     Random random = new Random();
     APImage image = new APImage("smokey.jpg");
     image.draw();
     System.out.println("enter the RGB values of the filter: ");
     int newColorArray[]=new int[]{reader.nextInt(),reader.nextInt(),reader.nextInt()};
     int[] saveArray = new int[3];
     saveArray = newColorArray.clone();
     for (Pixel p : image){
        int oldColorArray[] = new int[]{p.getRed(),p.getBlue(),p.getGreen()};
        for (int i = 0; i<newColorArray.length ; i++) {
          if (newColorArray[i] + oldColorArray[i] < -256 || newColorArray[i] + oldColorArray[i] > 256) {
            System.out.println("exceed RGB scope, automatically adujust.");
            newColorArray[i] = 0;
          }
        }


            p.setRed(newColorArray[0] + oldColorArray[0]);
            p.setBlue(newColorArray[1] + oldColorArray[1]);
            p.setGreen(newColorArray[2] + oldColorArray[2]);
            newColorArray = saveArray.clone();
           }


         System.out.print("Press return to continue:");

         reader.nextLine();

         image.draw();


   }
 }
