import java.util.*; 
   
public class lab2
{ 
    public static void main(String[] args)

    { 
      
      String[] names = new String [] {"Hoskins", "Harper", "Peters", "Foles", "Emib", "Reddeck", "Giroux", "Couturler"};
      System.out.println(Arrays.toString(names));
      

        // Let us create a list of strings 
        List<String>  mylist = new ArrayList<String>(); 
        
           mylist.add("Hoskins"); 
           mylist.add("Harper"); 
           mylist.add("Peters"); 
           mylist.add("Foles");
           mylist.add("Emib");
           mylist.add("Reddeck");
           mylist.add("Giroux");
           mylist.add("Couturler");         
   
        
        // Here we are using rotate() method 
        // to rotate the element by distance 2 
        Collections.rotate(mylist, 2); 
        
        System.out.println ("After" + mylist);
   


}

}