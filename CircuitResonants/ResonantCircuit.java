public class ResonantCircuit
{
  private double w0;
  private double B;
  private double k;

  public ResonantCircuit(double w0, double B, double k)
  {
    this.w0 = w0;
    this.B = B;
    this.k = k;
  }

  public double getW0()
  {
    return this.w0;
  }
  public void setW0(double resonantFrequency)
  {
    this.w0 = resonantFrequency;
  }

  public double getB()
  {
    return this.B;
  }
  public void setB(double bandwidth)
  {
    this.B = bandwidth;
  }

  public double getK()
  {
    return this.k;
  }
  public void setK(double resonantFrequencyGain)
  {
    this.k = resonantFrequencyGain;
  }

  public void display()
  {
    System.out.println("The description of the resonant frequency response, respectively in resonant frequency, bandwidth, and resonant frequency gain, is: " + w0 + ", " + B + ", and " + k);
  }
}
