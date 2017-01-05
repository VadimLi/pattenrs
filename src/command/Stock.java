package command;


public class Stock {

    private static final String NAME = "ABC";

    private static final int QUANTITY = 90;

    public void buy() {
        System.out.println("Stock [ Name: "+ NAME +": "
                            + QUANTITY +" ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: "+ NAME +": "
                + QUANTITY +" ] sold");
    }

}
