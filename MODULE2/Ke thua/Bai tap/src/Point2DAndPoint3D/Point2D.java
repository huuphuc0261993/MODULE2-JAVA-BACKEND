package Point2DAndPoint3D;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    //GETTER
    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float[] getXY(){
        float[]position = {this.x,this.y};
        return position;
    }
//SETTER

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }
}
