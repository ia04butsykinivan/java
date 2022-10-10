public class Triangle extends Shape {
    int a;
    int b;
    int c;

    public Triangle(String shapeColor, int a, int b, int c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void draw() {

    }
}