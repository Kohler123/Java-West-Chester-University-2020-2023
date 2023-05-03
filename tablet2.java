/*
   Brandon Kohler 
   Csc 141 
   April 8th 2020
   Midterm Exam
*/


import java.util.Scanner;

public class tablet2
{
   public static void main(String[] args)
   {  
      Scanner kb = new Scanner(System.in);
      
      char model;
      int speak;
      String inputString;
      
      
      double Tablet = 0.0;
      double STATETAX = .04; 
      double COUNTYTAX = .02;
      double countyTax;
      double stateTax;
      double totalTax;
      double totalSale;
      double speaker=0.0;
      double purchaseAmount;
      int spkA = 100;
      int spkB = 70;
      int spkC = 60;
      
     
      System.out.println("Input tablet model: A, R, E (Advanced, Regular, Economy)");
      inputString = kb.nextLine();
      inputString = inputString.toUpperCase();
            model = inputString.charAt(0);
      speak= inputString.charAt(0);
      
      switch (model)
      
    {
      
      case 'A':
       System.out.println("input external speaker size in inches (10,8,6)");
       inputString = kb.nextLine();
       inputString = inputString.toUpperCase();
       speak= inputString.charAt(0);
       

      if (speak==10)
      
      {
                System.out.println("Tablet: $" + 'A');
                 System.out.println("Speaker: $" + spkA);
                               
      } 
            
      else if (speak==8)
      
      {
               System.out.println("Tablet: $" + 'A' );
                System.out.println("Tablet: $" + spkB);
                             
      } 
       
      else if (speak==6)
      
      {
            System.out.println("Tablet: $" + 'A' );
             System.out.println("Tablet: $" + spkC);
                                    
      }
      
      Tablet = 500;
      break;
      
      
      
      case 'R':  
      Tablet = 400;
      break;
       
      
      case 'E':
      Tablet = 300;
      break;
      
      default: model='E';
      Tablet = 300;
      break;

    }
   
     
      // Calculate the county tax
      countyTax = COUNTYTAX * Tablet;
      
      // Calculate the state tax
      stateTax = STATETAX * Tablet;
      
      // Calculate the total tax
      totalTax = stateTax + countyTax;
      
      // Calculate the total sale
      purchaseAmount= Tablet + speaker;
      
      totalSale = totalTax + Tablet; 
      
      //display results
      
      System.out.println("Tablet:  $" + Tablet);
      
      System.out.println("Speaker: $" + speaker);
      
      System.out.println("State sales tax:   $" + stateTax);
      
      System.out.println("County sales tax: $" + countyTax);
      
      System.out.println("Total sales tax:  $" + totalTax);
      
      System.out.println("Total sale:       $" + totalSale);
      
      
     
      }
      }
      
      
      