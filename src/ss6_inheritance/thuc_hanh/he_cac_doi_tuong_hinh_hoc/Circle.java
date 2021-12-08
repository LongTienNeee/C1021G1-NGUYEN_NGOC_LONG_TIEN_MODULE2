package ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    ;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        double area;
        area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
    public double getPerimeter(){
        double perimeter;
        perimeter = this.radius * 2 * Math.PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + " .Whích is a subclass off Shape";
    }
}
