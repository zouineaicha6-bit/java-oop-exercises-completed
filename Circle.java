public class Circle {
    private double radius;
    // TODO: static int numberOfCircles
    private static int numberOfCircles;

    public Circle(double radius) {
        // TODO: validate radius ≥ 0 (if negative, set to 0)
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
        // TODO: increment numberOfCircles
        numberOfCircles++;
    }

    public double getArea() {
        // TODO
        return Math.PI * radius * radius;
    }

    // GETTERS
    public double getRadius() {
        return radius;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    // SETTERS
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }
}