//Brandon Kohler
//CSC 240
//02/22/2021

import java.util.Scanner;
public class Piglatin
{

public static Boolean isVowel(char c)
{
   if ( c == 'a' || c == 'A' || c == 'e' || c == 'E'|| c == 'I'||
      c == 'i' || c == 'o' || c == 'O' || c == 'U'|| c == 'u')
      
    return true;
    return false; 
}

public static String findPigLatin(String input)

{
   int size = input.length();
   String pigL = "";
   int i;
  
 for(i=0; i < size; i++)
 {
   if(isVowel(input.charAt(i)))
   {
  break;
   }
 }
 
   if (i == size)
   {
   return "";
   }
 
 pigL = input.substring(i);
 
 pigL = pigL + input.substring(0, i - 0);
 
 pigL = pigL + "ay";
 
 return pigL;
 
} 

public static void main(String argvs[])

{
   String str = "";
   
   Scanner scan = new Scanner(System.in);
   System.out.println("enter a word");
   
   str = scan.nextLine();
   
   String ans = findPigLatin(str);
   
   if (ans.equals(""))
   
   {
      System.out.println("This cannot be converted to pig latin");
   }
   
   else
   {
      System.out.println(ans);
   }
   
}
         
} 
  