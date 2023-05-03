// Brandon Kohler 
// CSC 142 
// Frank Ganther
// 12/01/2020


import java.util.*;
import java.io.File;


public class CSC_142BaseballStats3
{
 public static void main (String[] args) throws Exception
 {
 
   int atBats = 0; 
   int hits = 0; 
   int doubles = 0;
   int triples = 0; 
   int homeRun = 0; 
   int walks = 0; 
 
//--FCG File baseball = new File ("Lab_7BaseballStats.txt");
      File baseball = new File ("Stats.txt");		// FCG used my own text file.
      Scanner stats = new Scanner (baseball);
      
      String PlayersName = stats.nextLine();
      System.out.println(PlayersName);
   
//--FCG while(stat.hasNext())
   
   while(stats.hasNext())
   {
   
//--FCG String L2 = stat.nextLine();
      String L2 = stats.nextLine();
      String [] statsArray = L2.split(" "); 
      System.out.println(Arrays.toString(statsArray));
   
      atBats  = atBats + Integer.parseInt(statsArray[0]);
      hits    = hits + Integer.parseInt(statsArray[1]);
      doubles = doubles + Integer.parseInt(statsArray[2]);
      triples = triples + Integer.parseInt(statsArray[3]);
      homeRun = homeRun + Integer.parseInt(statsArray[4]);
      walks   = walks + Integer.parseInt(statsArray[5]);
   
   
      System.out.printf(" ad=%d, hits=%d, doubles=%d, triples=%d, homeruns=%d, walks=%d.\n", 
                      atBats, hits, doubles, triples, homeRun, walks);
      int bA = (int)(((double) hits / atBats) * 1000);
      System.out.printf("BA: %d\n.", bA);
  
      int sP = ((int) ((double)(homeRun * 4) + ((double)triples * 3) + (doubles * 2)) + walks ) / (atBats);
  
      System.out.printf("SP: %d\n.", sP);
   }
  }                  
 }