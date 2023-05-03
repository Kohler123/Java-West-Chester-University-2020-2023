
//---------------------------------------------------------------------
//	Frank Ganther	Thursday, 9/17/20
//	
//	Sample code that I wrote while holding class on 9/17/20.
//	It demonstrates how to make a method that helps with inputting
//	an integer, and catching exceptions.
//
//	Play around with the code, and try different things.
//---------------------------------------------------------------------

import java.util.Scanner;
import java.io.FileNotFoundException;

public class CreatingreadInt
   {
	public static void main(String[] args)
		{
		int a;
		System.out.println ("Testing new readInt() method.\n");
		
		a = readInt ("Enter an integer value: ", "Not a valid integer, try again.");
		
		System.out.printf ("After parse, integer value  = %d.\n",a);
		}

	//-------------------------------------------------------------------
	public static int readInt (String inputMsg, String errMsg)
		{		
		Scanner keybd = new Scanner (System.in);
		int a = 0;
		String s1;
		boolean parseWorked = false;
		
		while (!parseWorked)
			{
			System.out.print (inputMsg);
			s1 = keybd.nextLine();
			System.out.printf ("Value as string = %s.\n",s1);
	
			try	{
				a = Integer.parseInt(s1);
				parseWorked = true;
				}
			catch (Exception e)
				{
				System.out.println (errMsg);
				}
			
			} // end-while
		return a;
		}
		
		
	}