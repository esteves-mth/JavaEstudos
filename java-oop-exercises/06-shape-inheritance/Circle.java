public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    } public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double d = radius*radius;
        return Math.PI*d;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
