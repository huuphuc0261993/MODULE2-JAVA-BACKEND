package Point2DAndPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    //GETTER
    public float getZ() {
        return this.z;
    }

    public float[] getXYZ(){
        float[]XYZ = {getX(),getY(),getZ()};
        return XYZ;
    }

//SETTER
    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z ){
        float[]XYZ = {x,y,z};
    }

    @Override
    public String toString() {
        return super.toString()+"-->"+Arrays.toString(getXYZ());
    }
}
