import java.util.*;
import java.io.File;
import java.io.IOException;

public class CSC_142BaseballStats2
{
 public static void main (String[] args) throws IOException
 {
 
 int atBats = 0; 
 int hits = 0; 
 int doubles = 0;
 int triples = 0; 
 int homeRun = 0; 
 int walks = 0; 
 
      File baseball = new File ("Lab_7BaseballStats.txt");
      Scanner stat = new Scanner (baseball);
      
   String PlayersName = stat.nextLine();
   System.out.println(PlayersName);
   
   while(stat.hasNext())
   {
   
   String L2 = stat.nextLine();
   String [] statsArray = L2.split(" "); 
   System.out.println(Arrays.toString(statsArray));
   
   atBats = atBats + Integer.parseInt(statsArray[0]);
   hits = hits + Integer.parseInt(statsArray[1]);
   doubles = doubles + Integer.parseInt(statsArray[2]);
   triples = triples + Integer.parseInt(statsArray[3]);
   homeRun = homeRun + Integer.parseInt(statsArray[4]);
   walks = walks + Integer.parseInt(statsArray[5]);
   
   
  System.out.printf(" ad=%d, hits=%d, doubles=%d, triples=%d, homeruns=%d, walks=%d.\n", 
                     atBats, hits, doubles, triples, homeRun, walks);
  int bA = (int)(((double) hits / atBats) * 1000);
  System.out.printf("BA: %d\n.", bA);
  
  int sP = ((int) ((double)(homeRun * 4) + ((double)triples * 3) + (doubles * 2)) + walks ) / (atBats);
  
  System.out.printf("SP: %d\n.", sP);
  }
  }                  
 }