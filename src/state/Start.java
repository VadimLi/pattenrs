package state;

public class Start implements State {

    @Override
    public void doAction() {
        /** call start server **/
        System.out.println("start server...");
    }

}
