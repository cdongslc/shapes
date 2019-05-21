import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int answer = random.nextInt(1000);
    int guess = 0;
    boolean correct = false;
    int count = 0;
    if(guess == answer)
    {
        correct = true;
    }
    do{
      System.out.println("What is your guess?");
      guess = scan.nextInt();
      if(guess < answer)
      {
        System.out.println("Your guess was too low!  Try again!");
        count++;
      }
       count++;
     if(guess > answer)
      {
          System.out.println("Your guess was too high!  Try again!");
          count++;
      }
      if(guess == answer)
      {
              System.out.println("Congratulations!  You guessed the number in " + count + " tries!");
      }
    }while(!correct);
  }
}
