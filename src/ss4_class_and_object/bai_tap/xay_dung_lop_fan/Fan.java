package ss4_class_and_object.bai_tap.xay_dung_lop_fan;

public class Fan {
    public final byte slow = 1;
    public final byte medium= 2;
    public final byte fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5.0f;
    private String color = "Blue";

    public Fan(){};
    public Fan(int speed, boolean on, double radius , String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public boolean isOn(){
        return on;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Fan{" +
                " Speed = " + speed +
                " , on = " + (isOn() ? "fan is on" : "fan is off") +
                " , Radius = " + radius +
                " , Color = " + color +
                "}";
    }


}
