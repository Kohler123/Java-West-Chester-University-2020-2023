import java.util.Scanner; //use for input from keyboard

public class Bonus //change this to program name
{
   //main program goes here
   public static void main(String[] args)
   {
      //input from keyboard
      Scanner kb = new Scanner(System.in);
      int salary,years;
      System.out.println("What is your salary?");
      salary = kb.nextInt(); //object.method()
      System.out.println("How many years of service?");
      years = kb.nextInt(); //object.method()
      if (salary<50000)
         System.out.println("No bonus for salary < $50,000");
      else if (years<2)
         System.out.println("No bonus for years < 2");
      else
         System.out.println("You get a bonus!");
         
         }
         
        }