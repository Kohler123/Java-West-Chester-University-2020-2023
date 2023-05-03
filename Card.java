public class Card {

   private Suit mySuit;
   
   private int myNumber;

 public card(Suit aSuit, int aNumber) {
 
   this.mySuit = aSuit;
   this.myNumber = aNumber;
      
   if(aNumber >= 2 && aNumber <= 13) {
     }else{
         System.err.println(aNumber + "not valid");
         System.exit(1);
     } 
  }
 
 public int getNumber() {
      return myNumber; 
  }
   
 public String toString() {
     
     String numStr = "error";
     
     switch(this,myNumber) {
     
     case 2:
           numStr = "two";
           break;
     case 3:
           numStr = "three";
           break;
     case 4:
           numStr = "Four";
           break;
     case 5:
           numStr = "Five";
           break;
     case 6: 
           numStr = "six";
           break;
     case 7:
           numStr = "seven";
           break;
     case 8:
           numStr = "eight";
           break;
     case 9:
           numStr = "nine";
           break;
     case 10:
           numStr = "ten";
           break;
     case 11:
           numStr = "jack";
           break;
     case 12:
          numStr = "queen";
          break;
     case 13:
          numStr = "king";
          break;
     case 1:
          numStr = "ace";
          break; 
     
      }
      
      return numStr + "of" + mySuit.toString();     
  }
 
}