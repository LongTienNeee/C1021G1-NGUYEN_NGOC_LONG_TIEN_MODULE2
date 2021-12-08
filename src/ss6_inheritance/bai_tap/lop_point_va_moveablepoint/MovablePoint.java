package ss6_inheritance.bai_tap.lop_point_va_moveablepoint;

public class MovablePoint extends Point {
    public float xSpeed ;
    public float ySpeed;

    public MovablePoint(){};
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = {xSpeed, ySpeed};
        return speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
//    public float move(){
//        x += xSpeed;
//        y += ySpeed;
//        return
//    }
}
