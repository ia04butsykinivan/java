import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> model = new ArrayList<Shape>();
        Rectangle shape1 = new Rectangle("Green", 1, 2);
        Triangle shape2 = new Triangle("Yellow", 1, 2, 2);
        Circle shape3 = new Circle("Red", 4);
        model.add(shape1);
        model.add(shape2);
        model.add(shape3);

        View view = new View();

        Controller controller = new Controller(model, view);

        controller.printShapes();
        controller.printTotalArea();
        controller.printTotalArea(Rectangle.class);
        controller.printShapesByArea();
        controller.printShapesByColor();
    }
}