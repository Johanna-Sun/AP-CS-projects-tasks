import images.APImage;
import images.Pixel;
import java.awt.*;
import java.util.Scanner;

public class Project510 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    APImage oldImage = new APImage("smokey.jpg");
    oldImage.draw();
    int x = oldImage.getWidth();
    int y = oldImage.getHeight();
    APImage newImage = new APImage(x,y);

    for (int i = 0; i < oldImage.getWidth(); i++) {
          for (int j = 0; j < oldImage.getHeight(); j++) {
              Pixel p = oldImage.getPixel(i, j);
              newImage.setPixel(oldImage.getWidth()-i-1, oldImage.getHeight()-j-1, p);
          }
      }


      System.out.print("Press return to continue:");
      scanner.nextLine();
      newImage.draw();
  }
}
