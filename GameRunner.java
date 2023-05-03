import java.util.Scanner;

public class GameRunner {

   public static void main(String[]args) {
   
      Scanner sc = new Scanner(System.in);
      Deck theDeck = new deck(1,true);
      
      Player me = new Player("brandon");
      Player dealer = new Player("dealer");
      
      me.addCard(theDeck.deal.NextCard());
      dealer.addCard(theDeck.dealNextCard());
      me.addCard(theDeck.dealnextCArd());
      dealer.addCard(theDeck.dealNextCard());
      
      System.out.println("Cards are dealt");
      me.printHand(true);
      dealer.printHand(false);
      System.out.println("\n");
      
      boolean meDone = false;
      boolean dealerDone = false;
      String ans;
      
      while (!meDone || !dealerDone) {
      
         if (!meDone) {
         
         System.out.println("hit or stay");
         ans = sc.next();
         System.out.println();
         
         if (ans.compareToIgnoreCase("h") == 0) {
         
            meDone = !me.addCard(theDeck.dealNextCard());
            dealer.printHand(true);
            
           } else {
               meDone = true;
           }
           
           if(!dealerDone) { 
               if (dealer.getHandSum() < 17) {
                  System.out.println("the dealer hits");
                  dealerDone = !dealer.addCard(theDeck.dealNextCard());
                  dealer.printHand(false);
                  } else { 
                        System.out.println("the dealer system");
                        dealerDone = true; 
                       }
                     }
                     
                   System.out.println();
         }
         
         sc.close();
         
         me.printHand(true);
         dealer.printHand(true);
         
         int mySUm = me.getHandSum();
         int dealerSum = dealer.getHandSum();
         
         if (mySum > dealerSum && mySum <= 21 || dealerSum > 21) {
               System.out.println("you Win");
         } else { 
               System.out.println("Dealer Wins");
         }      
         
         
      }
   }
}  