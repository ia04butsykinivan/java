public class Circle extends Shape {
    int a;

    public Circle(String shapeColor, int a) {
        super(shapeColor);
        this.a = a;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }

    @Override
    public double calcArea() {
        return 3.14 * this.a * this.a;
    }

    @Override
    public void draw() {

    }
}