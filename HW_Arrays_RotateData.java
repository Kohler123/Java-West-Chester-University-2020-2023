//Brandon Kohler
//CSC 142
//Frank Ganther



//------------------------------------------------------
//	Demo: Rotating (shifting) data within an array.
//------------------------------------------------------

import java.util.*;


class HW_Arrays_RotateData
	{
	//-----------------------------------------------
	public static void main(String args[]) 
    	{
		Scanner keybd = new Scanner (System.in);
		
		int x[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		
      
		int arLen = x.length;
		int idx, next, temp;
		int numTimes, inputNum = -1;
		
		while ((inputNum < 0) || (inputNum > 5))
			{
			System.out.print ("Enter number of rotations wish to make: ");
         inputNum = keybd.nextInt();
         
			if ((inputNum < 0) || (inputNum > 5))
				System.out.println ("Invalid number of rotations.  Please enter again.");			}
         			
		//-- Fill in the code that will rotate the data in the array, 1 idx spot to the right.
		//-- the end data will wrap around to index 0.
            
            
		System.out.printf ("\nData, Before: %s.\n", Arrays.toString(x));
      
     
     for (int j = 0; j < inputNum; j++)
     
      {
         int last = x[x.length - 1];
         
         for (int i = x.length -1; i>0; i--)
         
         {
            x[i] = x[i-1];
         } 
         
         x[0] = last; 
      }   

		System.out.printf ("Data, After : %s.\n", Arrays.toString(x));

		} 
   } 
