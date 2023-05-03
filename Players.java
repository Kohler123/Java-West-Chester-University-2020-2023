class Players {

    private String name;
    private Card[] cards = new Card[13];

    Players(String name){
        this.name = name;
    }
    void showPlayerCards(){
        System.out.println("---------------------------------------------");
        for (Card card : cards){
            //you had been checking here if this was null, but there was no need for that check
            System.out.printf("%s  of %s\n", card.rank, card.suit);
        }
        System.out.println("---------------------------------------------");
    }
    void receiveCard(Card card, int position){
        cards[position] = card;
    }
    String getName(){
        return name;
    }

}