import java.util.Scanner; //use for input from keyboard

public class Grades //change this to program name
{
   //main program goes here
   public static void main(String[] args)
   {
      //input from keyboard
      Scanner kb = new Scanner(System.in);
      int number;     
       System.out.println("What is your numerical grade?");
     number = kb.nextInt(); //object.method()
     char grade;
     if (number>=90)
     grade='a';
     if(number>=80) 
     grade= 'b';
     else if(number<=80)
 }   
 }