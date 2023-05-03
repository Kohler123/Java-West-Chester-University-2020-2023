public class Main {
    public static void main(String[] args) {

        Broker b = new Broker("Fidelity");
        b.buy("Goog", 9);
        b.buy("Amzn", 1);
        b.sell("Goog", 8);
    }
}