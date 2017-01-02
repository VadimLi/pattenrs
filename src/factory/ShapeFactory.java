package factory;

public class ShapeFactory {

    public Shape getShape(String shape) {

        switch (shape) {
            case "Rect" : return new Rect();
            case "Circle" : return new Circle();
            default: throw new IllegalArgumentException("Не верная фигура. Фигура должна быть 'Rect' или 'Circle' !");
        }

    }

}
