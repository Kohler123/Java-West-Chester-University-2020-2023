//Brandon Kohler
//CSC 240
//02/22/2021

import java.util.Scanner;
class Hmw2
{
   public static void main(String args[])
  { 
     String lookUp;
     
     String[] people = {"Steve Jobs", "John Smith", "Brad Smith"};
     
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("enter the name");
     
     lookUp = keyboard.nextLine();
     
     System.out.println("heres the names");
     for (String person : people)
     {
         if (person.startsWith(lookUp))
            System.out.println(person);
     }
   }
}
         