package command;

public class Main {

    public static void main(String[] args) {
        final Stock stock = new Stock();

        final BuyStock buyStock = new BuyStock(stock);
        final SellStock sellStock = new SellStock(stock);

        final Broker broker = new Broker();

        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();

    }

}
