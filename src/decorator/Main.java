package decorator;


public class Main {

    public static void main(String[] args) {

        RedShapeDecorator redCircleDecorator = new RedShapeDecorator(new Circle());

        redCircleDecorator.draw();

        RedShapeDecorator redRectDecorator = new RedShapeDecorator(new Rectangle());

        redRectDecorator.draw();

    }

}
