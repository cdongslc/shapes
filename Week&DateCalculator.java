import java.time.LocalDate;
import java.util.Scanner;

public class Week&DateCalculator
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int year = LocalDate.now().getYear();
    // print day of week for Pi day
    LocalDate piDate = LocalDate.of(year,03,14);   
    System.out.println("The weekday for Pi day is: " + piDate.getDayOfWeek().toString());
    
    //print date and weekday for programmer's day
    LocalDate programmerDate = LocalDate.ofYearDay(year,256);
    System.out.println("\nThe date for Programmer's Day is: " + programmerDate.toString());
    System.out.println("\nThe weekday for Programmer's Day is: " + programmerDate.getDayOfWeek().toString());
    
    //print date and weekday for inputted # of days earlier than today
    LocalDate today = LocalDate.now();
    System.out.print("\nThis will calculate the date and weekday of a given date before today! \nHow many days back do you want to go?");
    int days = scan.nextInt();
    LocalDate earlierDate = today.minusDays(days);
    System.out.println("\nThe date for " + days + " days earlier than today is: " + earlierDate.toString());
    System.out.println("\nThe weekday for " + days + " days earlier than today is: " + earlierDate.getDayOfWeek().toString());
  }
}
