package strategy;


public class Main {

    public static void main(String[] args) {

        Context context = new Context(new Rectangle());

        context.draw();

        Context contextSec = new Context(new Circle());

        contextSec.draw();

    }

}
