package ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class TestShape {
    public static void main(String[] args) {


        Shape shape = new Shape();
        System.out.println(shape.getFilled());
        System.out.println(shape.getColor());

        Shape shape1 = new Shape("Red",false);
        System.out.println(shape1.getFilled());
        System.out.println(shape1.getColor());
        System.out.println(shape1);

    }
}