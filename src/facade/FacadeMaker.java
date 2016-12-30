package facade;

public class FacadeMaker {

    private final Circle circle;

    private final Rectangle rectangle;

    private final Square square;

    public FacadeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

}
