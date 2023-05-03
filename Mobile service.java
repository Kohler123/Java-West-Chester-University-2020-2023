import java.util.Scanner;


public class MobileService
{
public static void main(String[] args)
{
String input;   // To hold the user's input
char foodGrade; // Grade of pet food
// Create a Scanner object for keyboard input.
Scanner keyboard = new Scanner(System.in);
// Prompt the user for a grade of mobile service
System.out.println("Our Mobile Service is available in " +
                "three Packages:");
System.out.print("A, B, and C. Which do you want " +
              "pricing for? ");
input = keyboard.nextLine();
foodGrade = input.charAt(0);

// Display pricing for the selected grade.
switch(foodGrade)

{

case 'a':

case 'A':

   System.out.println("39.99 dollars per month 450 minutes provided and additional minutes are 0.45 per minute.");

   break;
case 'b':

case 'B':

   System.out.println("59.99 dollars per month 900 minutes provided and additional minutes are 0.40 per minut.");

   break;

case 'c':

case 'C':

   System.out.println("69.99 dollars per month unlimited minutes provided.");

   break;

default:

   System.out.println("Invalid choice.");

}

}

}