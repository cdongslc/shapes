import java.util.Scanner;
public class PrimeNumbers
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Please input the limit you would like to reach: " + "\n");
    int limit = scan.nextInt();
    int count;
    System.out.print("The prime numbers up to the limit are: \n");
    for(int i = 1; i <= limit; i += 2)
    {
      count = 0;
      if(i == 1 || i == 2)
      {
          System.out.print(i + " ");
      }
      for(int j = 2; j < i; j++)
      {
        if(i % j == 0)
        {
          count++;
        }
        if(j + 1 == i && count == 0)
        {
          System.out.print(i + " " );
        }
      }
    }
    System.out.print("\n");
  }
}
