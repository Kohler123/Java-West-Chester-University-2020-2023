import java.util.Scanner;
  public class GetLetterGrade
  {
  static int inputGrade; // input grade

   public static void main(String [] args)
  {
   Scanner reader = new Scanner(System.in); 


     int classAverage;
     int classMin; // class's minimum grade
     int classMax; // class's maximum grade

     while (inputGrade != -1) // while user is entering grades
  {

       System.out.println("Welcome to the grade calculator. \nPlease enter a 
       numeric grade.  After the last student in the class, enter a grade of 
       -1.");
       inputGrade = reader.nextInt();
       letterGrade(inputGrade); // calls letter grade method 
       findMaxAndMin();
        result();
   }

   }
   // find letter grade
   public static String letterGrade(int numGrade)
   {

   String gradeMessage = "";

   {

  if (numGrade >= 96 && numGrade <= 100) // if numeric grade is 96-100 then 
   it's A+
  {
    gradeMessage = "That's an A+.";
    result();
  // DOES THIS FOR GRADES A+ TO F, NOT SHOWN, too much to paste!
  }

  }
  }
     return gradeMessage;
  }

   public static int findCharGrade(int numGrade)
   {
      char letter;
      if (numGrade >= 90 && numGrade <= 100) // A
   {
       letter = 'A';

   }
       else if (numGrade >= 80 && numGrade < 90)  // B
  {
       letter = 'B';
  }
       else if (numGrade >= 70 && numGrade < 80)  // C
  {
       letter = 'C';

  }
       else if (numGrade >= 60 && numGrade < 70) // D
  {
       letter = 'D';
  }
       else if (numGrade < 60) // F
  {
       letter = 'F'; 
  }

  }




   // finds maximum and minimum grades
    public static int findMaxAndMin(int inputGrade)
    {

       int max = Math.max(inputGrade, max);
       int min = Math.min(inputGrade, min);

        if (inputGrade < max)
    {
          inputGrade = max;
          findCharGrade(inputGrade);
    }
       else if (inputGrade > min)
    {
          inputGrade = min;
          findCharGrade(inputGrade);
    }

     }
   public static void calcAverage(int sumOfGrades, int numOfStudents)
   {
   // something goes here

    }



   // finds results
   public static void result()
   {
     int min = findMaxAndMin(inputGrade);
     int max = findMaxAndMin(inputGrade);
     System.out.println("Please enter a numeric grade");
     int inputGrade = reader.nextInt();
     letterGrade(inputGrade);


     if (inputGrade == -1)
  {
    System.out.println("You entered " + numOfStudents + " students. Class 
    Average: " + average + " Class Minimum: " + min + " Class maximum: " + max 
    + " \nThanks for using the class grade calculator!");
  }

}