package command;


import java.util.ArrayList;
import java.util.List;

public class Broker {

    private final List<Order> orders = new ArrayList<>();

    public void takeOrder(final Order order) {
        orders.add(order);
    }

    public void placeOrders(){

        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }

}
