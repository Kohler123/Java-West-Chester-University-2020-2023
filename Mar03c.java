*/

import java.util.Scanner; //use for input from keyboard
import.java.io.*;

public class Mar03c //change this to program name
{
   //main program goes here
   public static void main(String[] args) throws IOException; 
   {
      //input from keyboard
      Scanner kb = new Scanner(System.in);
      File file = new File("Animals.txt");
      Scanner inputFile = new Scanner(file);//open file
      
      while (inputFile.hasNext())// read file and dump to screen
      {
         String str = inputFile.nextLine();
         System.out.println(str);
        
      }
     inputFile.close();
      
    
   }//main
}//container

