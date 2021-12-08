package ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle {
    private double side = 1.0;
    public Square(){};
    public Square(double side){
        super(side, side);
    }
    public Square(double width, double height, String color, boolean filled){
         super(width, height, color, filled);
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double width){
        setSide(width);
    }
    public void setHeight(double height){
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square width size = " + this.side + ", which is a subclass of ";
    }
}
