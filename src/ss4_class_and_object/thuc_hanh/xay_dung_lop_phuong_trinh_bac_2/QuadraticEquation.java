package ss4_class_and_object.thuc_hanh.xay_dung_lop_phuong_trinh_bac_2;

//ax^2 * bx + c = 0
public class QuadraticEquation {
    public double a, b, c;

    public QuadraticEquation(){};

     QuadraticEquation(double a, double b, double c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta;
        delta = this.b * 2 - 4 * this.a * this.b;
        return delta;
    }

    public void getRoot1() {
        double root1;
        if (getDiscriminant() > 0) {
            root1 = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        } else if (getDiscriminant() == 0) {
            root1 = -this.b / (2 * this.a);
        } else {
            System.out.println("The equation has no roots");
        }
    }

    public void getRoot2() {
        double root2;
        if (getDiscriminant() > 0) {
            root2 = (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        } else if (getDiscriminant() == 0) {
            root2 = -this.b / (2 * this.a);
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
