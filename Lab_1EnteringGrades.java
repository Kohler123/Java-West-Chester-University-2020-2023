
import java.util.*;

public class Lab_1EnteringGrades
{
public static void main (String [] args)
{
Scanner scan = new Scanner(System.in);

int i = 0;

int sum = 0;

int minValue = Integer.MAX_VALUE;

int maxValue = Integer.MIN_VALUE;

int[] test = new int[100];

int average;

System.out.println("enter grades from 0-100");

int gradeNumber = scan.nextInt();

while (gradeNumber != -1 && i <= 100)

  {
    if (gradeNumber > maxValue)
    {
        maxValue = gradeNumber;
        
    sum += gradeNumber;
    
    test[i] = gradeNumber;
    
    gradeNumber = scan.nextInt();
    
    i++;
    }
    
    if (gradeNumber<minValue);
    {
        minValue = gradeNumber; 
    
      sum += gradeNumber;
    
      test[i] = gradeNumber;
    
      gradeNumber = scan.nextInt();
    
      i++;
  
    }
    
   }

System.out.println("sum: " + sum + "\n max value: " + maxValue);



   
 }
    
    }
    
