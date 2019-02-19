
package shapes;

/**************
A pyramid is a polyhedron for which the base is a polygon and all lateral faces are 
triangels. In this class, we will only concern ourselves with right rectangular 
pyramid whose base is a right rectangle with base lengh and width, and with a height.

Of course, we can easily expand this class to include all kinds of pyramids with 
different math formula
******************/

public class PyramidClass {

  // private vars
  private int baseLength;
  private int baseWidth;
  private int height;  

  public PyramidClass(){
    baseLength = 0;
    baseWidth  = 0;
    height     = 0;
  }  

  public PyramidClass(int len, int wid, int hei){
    baseLength = len;
    baseWidth  = wid;
    height     = hei;
  }

  public void setDimension(int len, int wid, int hei){
    baseLength = len;
    baseWidth  = wid;
    height     = hei;
  }

  public double getSurfaceArea(){
    double area = 0;
    
    area = baseLength * baseWidth + baseLength * Math.sqrt(Math.pow((double)baseWidth/2.0, 2) + Math.pow((double)height,2)) + baseWidth * Math.sqrt(Math.pow((double)baseLength/2.0,2) + Math.pow((double)height,2));

    return area;
  }

  public double getVolume(){
    double volume = baseLength * baseWidth * height / 3.0;
    return volume;
  }
}
