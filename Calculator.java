/*
   Simple: use to start all Java programs
   Brandon Kohler
   2/13/2020
   
*/

import java.util.Scanner; //use for input from keyboard

public class Simple //change this to program name
{
   //main program goes here
   public static void main(String[] args)
   {
      //input from keyboard
      Scanner kb = new Scanner(System.in);
int x,y,z; // x and y are used to calculate
String input;//which calculation
char operation;
System.out.println("First number?");
x = kb.next.int();
System.out.println("Second number?");
y = kb.next.int();

kb.nextLine(); // Clears Input Buffer

System.out.println("Operation?");
input=kb.nextLine();
operation= input.charAT(0);//Start count at 0

switch(operstion)
{
   case'+':
      z = x + y;
      System.out.println("Result is:" + z);
     
      break;
      
      case'-':
      z = x - y;
      System.out.println("Result is:" - z);
     
      break;
      
      case'*':
      z = x * y;
      System.out.println("Result is:" * z);
     
      break;
      
      case'/':
      z = x / y;
      System.out.println("Result is:" / z);
     
      break;
      default:
      System.out.println)"Illegal operation"
      break;
      
      
      
      
}





}//container
