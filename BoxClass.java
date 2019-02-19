
package shapes;

public class BoxClass {

  // private vars
  private int length;
  private int width; 
  private int height;    

  public BoxClass(){
    length = 0;
    width  = 0;
    height = 0;
  }  

  public BoxClass(int len, int wid, int hei){
    length = len;
    width  = wid;
    height = hei;  
  }

  public void setSphereDimension(int len, int wid, int hei){
    length = len;
    width  = wid;
    height = hei; 
  }

  public double getSurfaceArea(){
    double area = (length * width + length * height + width * height) *2;
    return area;
  }

  public double getVolume(){
    double volume = length * width * height;
    return volume;
  }
}
