package command;

public class SellStock implements Order {

    private final Stock stock;

    public SellStock(final Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }

}
