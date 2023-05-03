/*
   Practice for midterm exam
   Uses switch and if statements
   No loops here...
   James D. Fabrey
*/
import java.util.Scanner;

public class Channels
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      String network;
      String defInput; //use for HD or SD definition
      char def;
      System.out.println("What network (CBS,ABC,NBC,PBS)?");
      network = kb.nextLine();
      System.out.println("What definition-high(HD) or standard(SD)?");
      defInput = kb.nextLine();
      def = defInput.charAt(0); //0 means first position in the input
            
      switch(network)
      {
         case "CBS":
            if (def=='H')
               System.out.println("KYW 503");
            else if (def=='S')
               System.out.println("KYW 3");
            else
               System.out.println("Illegal input!");
            break;
         case "ABC":
            if (def=='H')
               System.out.println("WPVI 506");
            else if (def=='S')
               System.out.println("WPVI 6");
            else
               System.out.println("Illegal input!");
            break;
         case "NBC":
            if (def=='H')
               System.out.println("WCAU 510");
            else if (def=='S')
               System.out.println("WCAU 10");
            else
               System.out.println("Illegal input!");
            break;
         case "PBS":
            if (def=='H')
               System.out.println("WHYY 512");
            else if (def=='S')
               System.out.println("WHYY 12");
            else
               System.out.println("Illegal input!");
            break;
         default:
            System.out.println("Illegal input!");
      }//switch
   }//main
}//container