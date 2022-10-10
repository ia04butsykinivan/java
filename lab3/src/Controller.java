import java.util.ArrayList;
import java.util.Collections;

public class Controller {
    public ArrayList<Shape> model;
    public View view;

    public Controller(ArrayList<Shape> model, View view) {
        this.model = model;
        this.view = view;
    }

    public void printShapes() {
        view.printShapes(model);
    }

    public double calculateTotalArea() {
        double totalArea = 0;

        for (Shape shape : model) {
            totalArea += shape.calcArea();
        }

        return totalArea;
    }

    public double calculateTotalArea(Class<Rectangle> clazz) {
        double totalArea = 0;

        for (Shape shape : model) {
            if (shape.getClass() == clazz) {
                totalArea += shape.calcArea();
            }
        }

        return totalArea;
    }

    public void printTotalArea() {
        double totalArea = calculateTotalArea();

        view.printArea(totalArea);
    }

    public void printTotalArea(Class<Rectangle> clazz) {
        double totalArea = calculateTotalArea(clazz);

        view.printArea(totalArea);
    }

    public void printShapesByArea() {
        Collections.sort(model, new AreaComparator());

        view.printShapes(model);
    }

    public void printShapesByColor() {
        Collections.sort(model, new ColorComparator());

        view.printShapes(model);
    }
}
