package observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverShape {

    private final List<Shape> list = new ArrayList<>();

    public void addShape(final Shape shape) {
        this.list.add(shape);
    }

    public void removeShape(final Shape shape) {
        this.list.remove(shape);
    }

    public void draw() {
        for (final Shape shape : list) {
            shape.draw();
        }
    }

}
