//Brandon Kohler
//CSC 240
//02/22/2021

import javax.swing.JOptionPane;
class Hmw1
{
   public static void main(String args[])
  { 
     
     String[] names = {"Steve Jobs", "John Smith", "Brad Smith"};
     
     String[] numbers = {"123-2345", "456-555", "421-789"};
     
     String search;
     int index = 0;
     
     search = JOptionPane.showInputDialog("enter name or part of name"+
                                            "to search for numbers");
     while(index < names.length)
     {
         if(names[index].startsWith(search))
            JOptionPane.showMessageDialog(null,names[index]+
                                         ":" + numbers[index]);
          index++;
     }                               
     
      System.exit(0);                                   
                                              
   }
}
         