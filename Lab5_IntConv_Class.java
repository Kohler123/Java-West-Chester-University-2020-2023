	//In Lab 4, you made a class with static methods.
	//The static methods converted an integer in binary, Hex, and Octal.
	//To do this, you made a class of static methods.
//The class did not have any fields. The static methods received the integer value as a parameter.

	//For this lab, make all of the static methods, non-static methods.

//Lab 5 Requirements
//.	Create a class named “Lab5_IntConv_Class *
//2	Have one private field name intValue.    *
//3	Add two constructors: * 
//a.	One is a default contructor.*
//b.	The other constructor accepts an integer.*
//4.	Make the 4 methods non-static.*
//5.	Add 2 more methods called setInteger() and getInteger().*
//6.	When one of the 4 methods are called they are to use the field intValue as the value to convert.*
//7.	These four methods will still return the answer, to the caller.*
//8.	Use the two supplied java files from the last assignment. Or the two java files your created from the ones given.

//Submit the main() java file and the java file that has the class.

//Brandon Kohler CSC 142
//Frank Ganther
//CSC 142
//10/21/2020

import java.util.*;

public class Lab5_IntConv_Class
{

private int intValue;
public Lab5_IntConv_Class(int param1) 
{
intValue = param1;
}

public Lab5_IntConv_Class()
{
}


//------------------------------------------
public void setInteger (int x)
{
intValue = x;
}

public int getInteger ()
{
return intValue;
}

//-----------------------------------------------------------------
public String Conv_SignedInt2Binary()
{
    if (intValue<0)
    {
        intValue = 256 + intValue;
    }
    String test = "";
    while(intValue > 0)
    {
        test = ( (intValue % 2 ) == 0 ? "0" : "1") +test;
        intValue = intValue/2;
    }
    return test;
}

//-----------------------------------------------------------------
public String Conv_UnsignedInt2Binary ()
{
    String test = "";
    while (intValue > 0)
    {
        test = ( (intValue % 2 ) == 0 ? "0" : "1") +test;
        intValue = intValue / 2;
    }
    return test;
}

//-----------------------------------------------------------------
public String Conv_unsignedInt2Hex ()
{

   String test = "";
   int rem;
   
  char remainders [] = {'0', '1', '2', '3' , '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   while (intValue > 0)
   {
     rem = intValue % 16;
     
     test = remainders [rem] + test;
     
     intValue = intValue/16;
           
   }
   return test;
   
}
//-----------------------------------------------------------------
public String Conv_UnsignedInt2Octal ()

{
 String test = "";
 char c1;
 int rem;
 
 while (intValue > 0)
   {
       rem = intValue % 8;
        
       c1 = (char) (rem + 48);
       
       test = c1 + test; 
   
       intValue = intValue / 8;
   }
    
    return test;
}



}







