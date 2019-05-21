public class SeriesResonantCircuit extends ResonantCircuits
{
  private double R;
  private double L;
  private double C;

  public ParallelResonantCircuits(double R, double C, double I)
  {
    this.R = R;
    this.L = L;
    this.C = C;
  }

  public void design()
  {
    R = 1/super.getK();
    L = R/super.getB();
    C = 1/(Math.pow(super.getW0(), 2) * L)
  }

  public void display()
  {
    System.out.println("For the description of the resonant frequency response, respectively in resonant frequency, bandwidth, and resonant frequency gain, as " + super.getW0() + ", " + super.getB() + ", and " + super.getK() + ", the circuit (in order of resistance, capitance, and inductance) will be: " + R + ", " + C + ", and " + L;)
  }
