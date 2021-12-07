package ss4_class_and_object.thuc_hanh.lop_hinh_chu_nhat;


public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    //Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //method
    public double getArea() {
        double area;
        area = this.width * this.height;
        return area;
    }

    public double getPerimeter() {
        double perimeter;
        perimeter = (this.height * this.width) * 2;
        return perimeter;
    }

    public String display() {
        return "Rectangle have " + "width =" + width + " and height =" + height;
    }
}


//        public static void main(String[] args){
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter width");
//            double width = input.nextDouble();
//            System.out.println("Enter height");
//            double height = input.nextDouble();
//
//            //Object
//            Rectangle rectangle = new Rectangle(width, height);
//            System.out.println("Area = " + rectangle.getArea());
//            System.out.println("Perimeter = " + rectangle.getPerimeter());
//            System.out.println(rectangle.display());
//        }
//}


