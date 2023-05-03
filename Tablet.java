import java.util.Scanner;

public class Tablet
{
   public static void main(String[] args)
   {  
   double tax = .06; 
      double purchaseAmount;
      double totalSale;
    
      Scanner kb = new Scanner(System.in);
      
      String Tablet;
      String speakerInput; //inches for the speaker
      int speaker;
      System.out.println("Input tablet model: A, R, E (Advanced, Regular, Economy)");
      Tablet = kb.nextLine();
      System.out.println("Input external speaker size in inches (10, 8, 6)");
      speakerInput = kb.nextLine();
      speaker = speakerInput.charAt(0); //0 means first position in the input
            
                                    switch(Tablet)
                                    {
                                       case "A":
                                      purchaseAmount= 500;
                                 
                                       break;
                                           
                                       case "R":
                                       purchaseAmount= 400;
                                      
                                       break;
                                       
                                       case "E":
                                       purchaseAmount= 300;
                                  
                                       
      
           
      
   totalSale= purchaseAmount * tax;
    System.out.println("Total sale:       " + totalSale);        
           
      
      
          }//switch
   }//main
}//container