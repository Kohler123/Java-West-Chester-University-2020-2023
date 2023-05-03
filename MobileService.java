/* Assignment 2: Mobile Service
   Dr. Fabrey
   February 27, 2020
*/
import java.util.Scanner;

public class MobileService
{
   public static void main(String[] args)
   {
      //use jGRASP I/O window
      Scanner kb = new Scanner(System.in);
      
      char packageLetter;
      int minutes;
      String inputString;
      double totalCharges = 0.0;
      
      //get the package from the user
      System.out.println("Enter the package letter.");
      inputString = kb.nextLine();
      inputString = inputString.toUpperCase();
      packageLetter = inputString.charAt(0);
      
      //get the hours from the user
      System.out.println("Enter minutes used.");
      minutes = kb.nextInt();
             
      //different results, based on the package
      switch(packageLetter)
      {
         case 'A':
         {
            totalCharges = 39.95;
            if (minutes > 450)
               totalCharges += .45*(minutes-450);
            break;
         }
         case 'B':
         {
            totalCharges = 59.95;
            if (minutes > 900)
               totalCharges += .40*(minutes-900);
            break;
         }
         case 'C':
         {
            totalCharges = 69.95;
            break;
         }
         default:
            System.out.println("Invalid input!");
            break;
      } 
      
      //display the result
      System.out.println("Total Charges = " + totalCharges);
   }
}