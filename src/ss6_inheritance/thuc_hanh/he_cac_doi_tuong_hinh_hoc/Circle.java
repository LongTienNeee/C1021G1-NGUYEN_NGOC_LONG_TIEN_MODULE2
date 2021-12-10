package ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

import ss7_abstract_class_and_interface.bai_tap.interface_resizeable_cho_các_lop_hinh_hoc.Resizeable;

public class Circle extends Shape implements Resizeable {
    public double radius = 1.0;

    public Circle(){};

    public Circle(double radius, String color , boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
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

//    @Override
//    public String toString() {
//        return "A Circle with radius = " + this.radius + " .Whích is a subclass off Shape";
//    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " . Whích is a subclass off " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = radius + percent;
    }
}