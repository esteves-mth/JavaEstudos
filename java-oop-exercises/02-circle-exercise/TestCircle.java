public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(6.5);

        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        System.out.println(c3.getRadius());
        c1.setRadius(4.7);
        c2.setRadius(-4);
        System.out.println(c1.getArea());
        System.out.println(c2.getPerimeter());
        System.out.println(c3.getPerimeter());
        System.out.println(c1.isLargerThan(c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
