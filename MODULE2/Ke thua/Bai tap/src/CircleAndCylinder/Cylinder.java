package CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return this.height*getArea();
    }
    @Override
    public String toString(){
        return super.toString()+", have height: "+this.height+"."
                +"Area Cylinder: "+getVolume();
    }
}
