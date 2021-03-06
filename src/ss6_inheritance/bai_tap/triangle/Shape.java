package ss6_inheritance.bai_tap.triangle;

public class Shape {
    public double side1  = 1.0;
    public double side2  = 1.0;
    public double side3  = 1.0;
    public double perimeter;

    public Shape(){};
    public Shape(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public void setSide1(double side1){
        this.side3 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        perimeter = side1 + side2 + side3;
        return perimeter;
    }
    public double getArea(){
        return Math.pow((perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3)), 0.5);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
