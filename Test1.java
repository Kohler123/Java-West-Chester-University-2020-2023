import java.util.Scanner;

public class Test1{
   

   private static String characters(String inputString)
     {
   
      int stringLength = inputString.length();
      
      if (stringLength <= 1){
         return inputString;
         }
         
         else{
         return inputString.charAt(stringLength - 1) + 
                inputString.substring(1,stringLength - 1) + inputString.charAt(0);
                }
                 
            }
            
 public static void main (String[] args)
 
    {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("enter a string");
    
    String userInput = scanner.next();
    
    System.out.println(characters(userInput));
    
      }
    
    }
            
            
                 