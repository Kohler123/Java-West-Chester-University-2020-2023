import java.util.Scanner;

public class Test 1 
   {

   private static String swapCharacters(String inputString)
      {
   
      int stringLength = inputString.length();
      
      if (length <= 1) {
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
    
    System.out.println("string" + swapCharacters(userInput));
    
    }
    
    }
            
            
                 