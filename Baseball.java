//Brandon Kohler
//CSC 142
//11/18/2020
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Baseball
{
public static void main(String args[]) throws IOException 
{
 		FileInputStream fileByteStream = null; // File input stream
		Scanner inFS = null; 
		Scanner kb = new Scanner (System.in);                  // Scanner object
		int fileNum, lineNum;                           // Data value from file
		String sFileName = "";
		String s1 = "";
						
		// Try to open file
		System.out.print ("\nDemo on opening a text file.");
		System.out.println ("Copy/pasted from ZyBooksm 9.4.1");

		//-- loop until user enters a file that can be opened.
		while (sFileName.equals(""))
			{
			System.out.print ("\nEnter text file to open: ");
			sFileName = kb.nextLine();
	
			//-- FileInputStream.. throw an exception if cannot find the file.
			try	{
				System.out.println("Opening file myfile.txt.");

				//-- this java program and the text file must be in the same folder.
				fileByteStream = new FileInputStream(sFileName);
				inFS = new Scanner(fileByteStream);

				}
			catch (Exception e)		// throws an exception
				{
				System.out.printf ("Open Error> Could not open file [%s].\n", sFileName);
				sFileName = "";		// keep the while loop true.
				}
			}		
			
		//-- just a status msg.
		System.out.println("Reading and printing numbers.");

		//-- keep looping as long as there is data in the file.
		lineNum = 0;
		while (inFS.hasNext()) 		//is there more data.
			{
         	s1 = inFS.nextLine();	//read the line as a string.
			lineNum++;
         	System.out.printf("Line %d: [%s] (before trim).\n", lineNum, s1); 
			s1 = s1.trim();			// removes any leading and trailing spaces.
         	System.out.printf("Line %d: [%s] (after  trim).\n", lineNum, s1); 
      		}

      	//-- Got out of the loop because ther was no more data.
      	System.out.println("\nClosing file " + sFileName);
      	fileByteStream.close(); // close() may throw IOException if fails
   		}
	}



  