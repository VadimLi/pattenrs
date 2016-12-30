package strategy;

public class Context {

    final Shape shape;

    public Context(final Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }

}
