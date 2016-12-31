package factory;

public class ShapeFactory {

    public Shape getShape(String shape) {

        switch (shape) {
            case "Rect" : return new Rect();
            case "Circle" : return new Circle();
            default: return null;
        }

    }

}
