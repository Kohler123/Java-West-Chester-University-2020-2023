// This is the second code for the main method: Brandon Kohler CSC 142 

// The main() method for working with static methos.
// Make changes to this main menu so it works with the static methods.
//---------------------------------------------------------------------
import java.util.*;

public class Lab4_IntConv_Main
{

//-----------------------------------------------------------------
    public static void main (String[] args)
    {
        Lab4_IntConv obj = new Lab4_IntConv();
        String s1 = "";
        int i, item = 0;
        int intValue;
        Scanner kb = new Scanner (System.in);

        String menu[] =
        {
        "\n\n1. Convert Integer (signed) to Binary.", //
                 
        
        "2. Convert Integer (unsigned) to Binary.",
        "3. Convert Integer (unsigned) to Hexadecimal.",
        "4. Convert Integer (unsigned) to Octal.", 
        "5. Exit Program.\n" };

 //System.out.println("input a number to get the program to start");
        //String integerString =kb.nextLine();

        //System.out.println("Binary Number:"+Integer.toBinaryString(Integer.parseInt(integerString)));

        final int EXIT_OPTION = 5;

        while (item != EXIT_OPTION)
        {
            for (i = 0; i < menu.length; i++) // print out menu
            System.out.println (menu[i]);

            System.out.printf ("Enter a valid selection (1-%d): ", EXIT_OPTION);
            item = kb.nextInt();

            if ((item < 1) || (item > EXIT_OPTION))
            System.out.printf ("Selection [%d] is not a vald option.\n\n", item);

            else
            {
                intValue = -1;
                if (item != EXIT_OPTION)
                {
                    System.out.printf ("Enter the integer value, to convert: ");
                    intValue = kb.nextInt();
                }

                switch (item)
                {
                    case 1: s1 = Lab4_IntConv.Conv_SignedInt2Binary (intValue);
                    
                 
                            break;
                    case 2: s1 = Lab4_IntConv.Conv_UnsignedInt2Binary (intValue);
                            break;
                    case 3: s1 = Lab4_IntConv.Conv_unsignedInt2Hex (intValue);
                            break;
                    case 4: s1 = Lab4_IntConv.Conv_UnsignedInt2Octal (intValue);
                            break;
                    case 5: System.out.println ("\n\t----- Goodbye -----\n");
                }
                 System.out.println(s1);
                  
                 
            }
        } // end-while
    }
}