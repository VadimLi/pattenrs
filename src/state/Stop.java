package state;

public class Stop implements State {

    @Override
    public void doAction() {
        /** call stop server **/
        System.out.println("stop.");
    }

}
