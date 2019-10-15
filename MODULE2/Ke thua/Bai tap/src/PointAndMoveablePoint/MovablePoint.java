package PointAndMoveablePoint;

import java.util.Arrays;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    //GETTER
    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public float[] getSpeed(){
        float[]speed = {this.xSpeed,this.ySpeed};
        return speed;
    }

    public float[] move(){
        float[]newMove = new float[2];
        newMove[0] = getX()+this.xSpeed;
        newMove[1] = getY()+this.ySpeed;
        return newMove;
    }
//SETTER
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString()+", speed="+"("+getxSpeed()+","+getySpeed()+")"
                + ", new postion = "+ Arrays.toString(move());
    }
}
