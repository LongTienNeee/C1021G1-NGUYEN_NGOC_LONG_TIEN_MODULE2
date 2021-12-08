package ss6_inheritance.bai_tap.triangle;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape(6.0, 7.0, 8.0);
        System.out.println("Perimeter  = " + shape1.getPerimeter());
        System.out.println("Area = " + shape1.getArea());

    }
}
