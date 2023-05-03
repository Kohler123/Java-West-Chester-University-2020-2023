//Brandon Kohler
//CSC 142
//Frank Ganther
//11/27/2020
//
//Happy Holidays!!!!!!


import java.util.*;
import java.io.File;

public class CSC_142BaseballStats
{
 public static void main (String[] args) throws Excepton //Static Method
  {
      int atBats = 0;
      int hits = 0; 
      int singles = 0; 
      int doubles = 0; 
      int triples = 0; 
      int homeRun = 0;
      int walks = 0;
 File sFilename = new File ("Lab_7Baseball.txt");
   
   Scanner s1 = new Scanner(sFilename);
   
 String playerName = s1.nextLine();
 
      System.out.println(PlayersName);
 
 while(s1.hasNext())
   {
   String stats = s1.nextLine();
   
      String [] ballArray = stats.split(" ");
      
        System.out.println(Array.toString(ballArray));
   
       atBats  =   atBats  + Integer.parseInt(ballArray[1]);
       hits    =   hits    + Integer.parseInt(ballArray[2]);
       doubles =   doubles + Integer.parseInt(ballArray[3]);
       triples =   triples + Integer.parseInt(ballArray[4]);
       homeRun =   homerun + Integer.parseInt(ballArray[5]);
       walks   =   walks   + Integer.parseInt(ballArray[6]);
       
       system.out.println("ab=%d, hits=%d, doubles=%d, triples=%d, Homruns=%d, walks=%d", atBats, hits, doubles, triples, homeRun, walks);
   } 
   
  }
   
}
   
 