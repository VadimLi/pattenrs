package observer;


public class Main {

    public static void main(String[] args) {

        final ObserverShape observerShape = new ObserverShape();
        observerShape.addShape(new Circle());
        observerShape.addShape(new Rect());
        observerShape.addShape(new Rect());

        observerShape.draw();

    }

}
