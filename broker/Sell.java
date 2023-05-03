public class Sell { 
    private String t;
    private int q;
    private Broker b;

    public Sell (String t, int q, Broker b) {
        this.t = t;
        this.q = q;
        this.b = b;

    }

    public void execute() {
        b.sell(t,q);
    }
}