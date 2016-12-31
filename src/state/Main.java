package state;


public class Main {

    public static void main(String[] args) {
        final Context context1 = new Context(new Start());
        context1.doAction();

        final Context context = new Context(new Stop());
        context.doAction();
    }

}
