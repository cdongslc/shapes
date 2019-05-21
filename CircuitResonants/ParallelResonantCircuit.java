public class ParallelResonantCircuit extends ResonantCircuit
{
  private double R;
  private double C;
  private double L;

  public ParallelResonantCircuits(double R, double C, double L)
  {
    this.R = R;
    this.C = C;
    this.L = L;
  }

  public void design()
  {
    R = super.getK();
    C = 1/(super.getB() * R);
    L = 1/(Math.pow(super.getW0, 2) * C);
  }

  public void display()
  {
    System.out.println("For the description of the resonant frequency response, respectively in resonant frequency, bandwidth, and resonant frequency gain, as " + super.getW0() + ", " + super.getB() + ", and " + super.getK() + ", the circuit (in order of resistance, capitance, and inductance) will be: " + R + ", " + C + ", and " + L)
  }
}
