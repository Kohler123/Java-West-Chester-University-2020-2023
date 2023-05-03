// Brandon Kohler
// Assignment 4
// Dr Fabrey 
// April 23rd 2020

import java.util.*;

class TestAverage

{

public static void main (String[]args)

{

   double test1,test2,test3,test4,test5;

   double average;

   char grade;

 Scanner keyboard = new Scanner(System.in);

System.out.println("Please enter the first test score");

   test1 = keyboard.nextDouble();

System.out.println("Please enter the second test score");

   test2 = keyboard.nextDouble();

System.out.println("Please enter the third test score");

   test3 = keyboard.nextDouble();

System.out.println("Please enter the fourth test score");

   test4 = keyboard.nextDouble();

System.out.println("Please enter the fifth test score");

   test5 = keyboard.nextDouble();

   average = calcAverage (test1,test2,test3,test4,test5);

System.out.println("The average of the test scores is " + average);

   grade = determineGrade(average);

System.out.println ("The average grade of the test scores is " + grade);

}

public static double calcAverage (double t1,double t2,double t3,double t4, double t5)

{

          return (t1+t2+t3+t4+t5)/5; //Calculates the average

}

public static char determineGrade (double t1)

{

   if (t1 >=90) return 'A';

 if (t1 >=80) return 'B';

   if (t1 >=70) return 'C';

 if (t1 >=60) return 'D';

    return 'F';
}
}

