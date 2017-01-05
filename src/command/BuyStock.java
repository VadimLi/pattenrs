package command;


public class BuyStock implements Order {

    private final Stock stock;

    public BuyStock(final Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }

}
