public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Players[] players = new Players[4];
    Card[] deck = Dealer.getDeckOfCards();

    System.out.println("Un-shuffled Cards.");
    Dealer.showCards(deck);
    Card[] shuffledCards = Dealer.shuffleCards(deck);
    System.out.println("Shuffled Cards.");
    Dealer.showCards(shuffledCards);

    for(int i = 0; i < players.length; i++) {
        System.out.println("Enter Player Name: ");
        players[i] = new Players(input.nextLine());
    }

    Players[] playersWithCards = Dealer.dealCards(players, shuffledCards);

    System.out.println("---------------------------------------------");

    for(Players player : playersWithCards) {
        System.out.println(player.getName());
        player.showPlayerCards();
    }

}
