package ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Shape {
    private String color = "Green";
    private boolean filled = true;

    public Shape(){}

    Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public boolean isfilled(){
        return this.filled;
    }


    @Override
    public String toString(){
        return "A Shape width color of " + this.color + " and " + (isfilled() ? "filled" :" not filled");
    }
}
