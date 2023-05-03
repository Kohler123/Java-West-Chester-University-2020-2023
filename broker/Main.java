public class Main {
    
    public static void main(String[] args) {
        Broker b = new Broker("Fidelity");

        //new Buyer ("GOOG", 9,6).execute();
        //b.buy("GOOG", 9);
        //b.buy("AMZN", 1);
        //b.sell("GOOG", 8);
        
        b.takeOrder(Memento.add( new Buy("GOOG", 10, b) ));
        b.takeOrder(Memento.add(new Buy("AMZN", 10, b) ));
        b.takeOrder(Memento.add(new Sell("AAPL", 5, b) ));
        b.placeOrders();

        Memento.undo();
        Memento.undo();

        Memento.redo();
        Memento.undo();

        Memento.redo();
        Memento.redo();


    }
}

