
package shapes;

public class SphereClass {

  // private vars
  private int radius;

  public SphereClass(){
    radius = 0;
  }  

  public SphereClass(int dia){
    radius = dia;
  }

  public void setSphereradius(int dia){
    radius = dia;
  }

  public double getSurfaceArea(){
    double area = Math.PI * 4.0 * Math.pow((double) radius,2);
    return area;
  }

  public double getVolume(){
    double volume = Math.PI * (4.0/3.0) * Math.pow((double)radius,3);
    return volume;
  }
}
