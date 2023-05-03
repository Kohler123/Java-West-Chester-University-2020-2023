import java.util.Scanner;

public class tablet3
{
   public static void main(String[] args)
   {  
      Scanner kb = new Scanner(System.in);
     double tabletEconomy;
     double tabletAdvanced;
     double tabletRegular; 
    char model;
      int speak;
      int finalPrice;
      int tax;
      int tablet;
      int spkA;
      int speaker;
      int spkB;
      
      String inputString;
      System.out.println("Input tablet model: A, R, E (Advanced, Regular, Economy)");
      inputString = kb.nextLine();
      inputString = inputString.toUpperCase();
            model = inputString.charAt(0);
      speak= inputString.charAt(0);
      switch (model)
    {  
      case 'A':
      {
       System.out.println("input external speaker size in inches (10,8,6)");
       inputString = kb.nextLine();
       inputString = inputString.toUpperCase();
       speak= inputString.charAt(0);
      } 
       break;
       
       if (speaker==10);
       {
       System.out.println("Tablet: $" + tabletAdvanced);
       System.out.println("Speaker: $" + spkA);
       int total= (tabletAdvanced + spkA);
       int tax = (total * 6/100);
       int finalPrice = (tax + total);
       System.out.println("Total: $" + tabletAdvanced);
       System.out.println("Tax: $" + tax);
       System.out.println("Final: $" + finalPrice);
       }
       break;

       if  (speaker==8);  
       {     
       System.out.println("Tablet: $" + tabletAdvanced);
       System.out.println("Speaker: $" + spkb);
       int total= (tabletAdvanced + spkb);
       int tax = (total * 6/100);
       int finalPrice = (tax + total);
       System.out.println("Total: $" + tabletAdvanced);
       System.out.println("Tax: $" + tax);
       System.out.println("Final: $" + finalPrice);
       }
       break;
       
       if (speaker==6);
       {
       System.out.println("Tablet: $" + tabletAdvanced);
       System.out.println("Speaker: $" + spkc);
       int total= (tabletAdvanced + spkc);
       int tax = (total * 6/100);
       int finalPrice = (tax + total);
       System.out.println("Total: $" + tabletAdvanced);
       System.out.println("Tax: $" + tax);
       System.out.println("Final: $" + finalPrice);
       }
       break; 
      

      case 'R':
      System.out.println("Tablet: $" + tabletRegular);
       System.out.println("Speaker: 0$");
       int total= (tabletRegular + spkA);
       int tax = (total * 6/100);
       int finalPrice = (tabletRegular + tax);
        System.out.println("Total: $" + tabletRegular);
        System.out.println("Tax: $" + tax);
          System.out.println("Final: $" + finalPrice);
          
          break;
          
      case 'E':
       System.out.println("Tablet: $" + tabletEconomy);
       System.out.println("Speaker: 0$");
        int total= (tabletEconom + spkA);
       int tax = (tabletEconomy * 6/100);
       int finalPrice = (tabletEconomy + tax);
        System.out.println("Total: $" + tabletEconomy);
        System.out.println("Tax: $" + tax);
          System.out.println("Final: $" + finalPrice);
          
          break;
          
         
        default: tablet='E';
       System.out.println("Tablet: $" + tabletEconomy);
       System.out.println("Speaker: 0$");
       int tax = (tabletEconomy * 6/100);
       int finalPrice = (tabletEconomy + tax);
        System.out.println("Total: $" + tabletEconomy);
        System.out.println("Tax: $" + tax);
          System.out.println("Final: $" + finalPrice);
}



}
}

