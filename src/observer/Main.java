package observer;


public class Main {

    public static void main(String[] args) {

        final ObserverShape observerShape = new ObserverShape();

        final Circle circle = new Circle();

        final Rect rect = new Rect();


        observerShape.addShape(circle);
        observerShape.addShape(rect);
        observerShape.addShape(rect);

        observerShape.removeShape(rect);
        observerShape.removeShape(rect);
        observerShape.removeShape(circle);

        observerShape.draw();

    }

}
