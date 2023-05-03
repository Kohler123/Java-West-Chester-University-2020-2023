/*
   Total Sales example from Ch. 5, Section 5
   Allow for any number of days
   (does not have to be 30)
   Dr. James Fabrey
   April 21, 2020
*/


import java.util.Scanner;
import java.io.*;

public class SalesReport
{
   public static void main(String[] args) throws IOException
   {
      String fileName;
      double totalSales;
      double totalDays;
      double averageSales;
    
      //file processing
      fileName = "Tablets.txt";//same directory as the program
      totalSales = getTotalSales(fileName);
      totalDays = getTotalDays(fileName); //traverse file again
      
      //calculation
      averageSales = totalSales/totalDays;
      
      //display
      displayResults(totalSales, averageSales);
   
   }//main
   
   public static double getTotalSales(String fn) throws IOException
   {
      double total = 0.0; //accumulator
      double sales; //use for each sale
      File file = new File(fn);
      Scanner inputFile = new Scanner(file);
      
      //traverse the file
      while (inputFile.hasNext())
      {
         sales = inputFile.nextDouble();
         total += sales;
      }
      inputFile.close(); //so we can traverse it again
      return total;
   }
 
   public static int getTotalDays(String fn) throws IOException
   {
      int total = 0; //accumulator to count days
      File file = new File(fn);
      Scanner inputFile = new Scanner(file);
      
      //traverse the file
      while (inputFile.hasNext())
      {
         inputFile.nextDouble();//just to traverse
         total += 1;//counts 1 more day
      }
      inputFile.close(); //so we can traverse it again
      return total;
   }
   
   public static void displayResults(double total, double avg)
   {
      System.out.printf("Total daily sales:    %.2f\n",total);
      System.out.printf("Average daily sales:  %.2f\n",avg);
   }
   
}//container
