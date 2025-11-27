public class Rectangle {
    double width;
    double height;

    // TODO: no-arg constructor → width = height = 1
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // TODO: parameterized constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        // TODO: return area
        return width * height;
    }
}