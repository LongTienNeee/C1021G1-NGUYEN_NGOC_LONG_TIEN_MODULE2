package ss6_inheritance.bai_tap.triangle;

public class Triangle extends Shape {
    public String color;
    public Triangle(){};
    public Triangle(double side1, double side2, double side3, String color){
        super(side1, side2, side3);
        this.color = color;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1 = " + side1 +
                " - side2 = " + side2 +
                " - side3 = " + side3 +
                " - color = " + color + '\'' +
                '}';
    }
}


