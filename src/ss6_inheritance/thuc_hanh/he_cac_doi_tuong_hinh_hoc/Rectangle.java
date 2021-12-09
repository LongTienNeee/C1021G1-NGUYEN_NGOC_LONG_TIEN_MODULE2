package ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(){}

    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }


    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        double area;
        area = this.width * this.height;
        return area;
    }
    public double getPerimeter(){
        double perimeter;
        perimeter = (this.height + this.width) * 2;
        return perimeter;
    }


//    public String toString(){
//        return "A Rectangle with width = " + this.width + " and length = "+ this.height + " which is a subclass of Shape" + super.toString();
//    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                " . Whích is a subclass off " + super.toString() +
                '}';
    }
}
