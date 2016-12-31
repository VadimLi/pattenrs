package state;


public class Context {

    private final State state;

    public Context(final State state) {
        this.state = state;
    }

    public void doAction() {
        this.state.doAction();
    }

}
