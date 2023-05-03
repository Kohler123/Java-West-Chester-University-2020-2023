import java.util.Scanner; //use for input from keyboard

public class Mar05b //change this to program name
{
   //main program goes here
   public static void main(String[] args)
   {
      //input from keyboard
      Scanner kb = new Scanner(System.in);
      int number1,number2,sum;
      System.out.println("What is your first number?");
      
      number1 = kb.nextInt(); //object.method()
      System.out.println("What is your second number?");
      number2 = kb.nextInt(); //object.method()
      
      sum = add(number1,number2);
      System.out.println("Sum: "+sum);
   }//main
    
   public static int add(int x, int y)
   {
      int z;
      z = x + y;
      return z;
   }
}//container