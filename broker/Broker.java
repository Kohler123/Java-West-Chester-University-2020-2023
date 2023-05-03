import java.util.LinkedList;
import java.util.List;

public class Broker {
    private String name;

    private List<Order> orderList = new ArrayList<Order>();

    //public Broker(String name) {
    //    this.name = name;
    //}

    public void takeOrder(Order o) {

        orderList.add(o);
    }

    public void undo() {

        b.sell(t,q);
    }

    public void placeOrders() {

        for(Order o : orderList)
            o.execute();
        
        orderList.clear();
    }

    public void buy(String t, int q) {
        System.out.println(name + " bought " + q + " shares of " + t);
    }

    public void sell(String t, int q) {
        System.out.println(name + " sold " + q + " shares of " + t);
    }
}
