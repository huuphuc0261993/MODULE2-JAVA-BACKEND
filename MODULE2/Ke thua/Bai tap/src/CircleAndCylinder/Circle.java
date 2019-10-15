package CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;

//GETTER
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
//SETTER
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
@Override
    public String toString(){
        return "Radius is: "+getRadius()+", have a color: "+getColor();
}
}
