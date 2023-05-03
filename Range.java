import java.util.Scanner; //use for input from keyboard

public class Range //change this to program name
{
   //main program goes here
   public static void main(String[] args)
   {
    int number;
 // Create a Scanner object for keyboard input.
 Scanner keyboard = new Scanner(System.in);
 // Get a number from the user.
 System.out.print("Enter a number in the range of 1 through 100: ");
 number = keyboard.nextInt();
 // Validate the input.
 while (number < 1 || number > 100)
 {
    System.out.print("Invalid input. Enter a number in the range " +
                     "of 1 through 100: ");
    number = keyboard.nextInt();
 }   
   }//main
}//container
