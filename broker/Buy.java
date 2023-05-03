public class Buy implements Order{ 
    private String t;
    private int q;
    private Broker b;

    public Buy (String t, int q, Broker b) {
        this.t = t;
        this.q = q;
        this.b = b;

    }

    public void execute() {
        b.buy(t,q);
    }
}