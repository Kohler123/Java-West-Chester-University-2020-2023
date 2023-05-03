//Brandon Kohler
//Csc 142
//Frank Gather
//09/17/2020



import java.util.*; 
   
public class array
{ 
    public static void main(String[] args)

    { 
      //Standard array
      //Couldnt seem to find out how to get array size of 10
      //since the elements only go to 0-7
      
      String[] names = new String [] {"Hoskins", "Harper", "Peters", "Foles", "Emib", "Reddeck", "Giroux", "Couturler"};
      
      
        // Let us create a list of strings 
        ArrayList<String>  mylist = new ArrayList<String>();
        
         
        
           mylist.add("Hoskins"); 
           mylist.add("Harper"); 
           mylist.add("Peters"); 
           mylist.add("Foles");
           mylist.add("Emib");
           mylist.add("Reddeck");
           mylist.add("Giroux");
           mylist.add("Couturler");
                  
       
      int i;
      int index = 2;
      
      //Array list and rotating of the elements 
      
      
      System.out.println("Before:" + mylist);
      
         mylist.set (3,"Wentz");
         
         mylist.set(0, "Rhys Hoskins");
         
      Collections.swap(mylist,0,1);
      
         mylist.remove(index);
         
      Collections.rotate(mylist,1);
      
         System.out.println("After:" + mylist);
      
       

       

    }

}