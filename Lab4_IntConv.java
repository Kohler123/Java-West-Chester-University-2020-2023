
//---------------------------------------------------------------------
//	CSC142, Fall 2020	Brandon Kohler
//
//	Static methods for a lab.
//	Write the code for these 4 static methods.
//---------------------------------------------------------------------


import java.util.*;
class Lab4_IntConv
{

//-----------------------------------------------------------------
static String Conv_SignedInt2Binary (int intValue)
{
    if (intValue<0){
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
static String Conv_UnsignedInt2Binary (int intValue)
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
static String Conv_unsignedInt2Hex (int intValue)
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
static String Conv_UnsignedInt2Octal (int intValue)

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
