abstract class Shape implements Drawable {
    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    String shapeColor;

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape{" +
                "shapeColor='" + shapeColor + '\'' +
                '}';
    }


}
