
import java.util.Scanner;
import shapes.BoxClass;
import shapes.SphereClass;
import shapes.PyramidClass;

class ShapeTester {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is your shape? (Please type in 1 for Box, 2 for Sphere and 3 for Pyramid).");
    int shape = keyboard.nextInt();
    
    //
    // For box calc 
    //

    if(shape == 1)
    {
      System.out.println("Please type in box length in integer");
      int len = keyboard.nextInt();
      System.out.println("Please type in box width in integer");
      int wid = keyboard.nextInt();
      System.out.println("Please type in box height in integer");
      int hei = keyboard.nextInt();        

      BoxClass box = new BoxClass(len, wid, hei);

      System.out.println("For Box, volume = " + box.getVolume() + "    area: " + box.getSurfaceArea());
    }

    //
    // For Pyramid calc 
    //

    if(shape == 2)
    {
      System.out.println("Please type in sphere's radius in integer");
      int ra = keyboard.nextInt();

      SphereClass sp = new SphereClass(ra);
      System.out.println("For Sphere,  volume = " + sp.getVolume() + "    area: " + sp.getSurfaceArea());
    }
    
    //
    // For Sphere calc 
    //
    
    if(shape == 3)
    {
      System.out.println("Please type in pyramid base length in integer");
      int len1 = keyboard.nextInt();
      System.out.println("Please type in pyramid base width in integer");
      int wid1 = keyboard.nextInt();
      System.out.println("Please type in pyramid height in integer");
      int hei1 = keyboard.nextInt();

      PyramidClass pm = new PyramidClass(len1, wid1, hei1);
      System.out.println("For Pyramid, volume = " + pm.getVolume() + "    area: " + pm.getSurfaceArea()); 
    }

    keyboard.close();    
 
  }
}