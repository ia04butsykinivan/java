public class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(String shapeColor, int a, int b) {
        super(shapeColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }

    @Override
    public double calcArea() {
        return this.a * this.b;
    }

    @Override
    public void draw() {

    }
}
