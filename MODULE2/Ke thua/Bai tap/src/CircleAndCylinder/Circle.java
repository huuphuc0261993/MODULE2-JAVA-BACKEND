package CircleAndCylinder;

public class Circle extends Geometric {
    private double radius;
    private String color;

    //GETTER
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    //SETTER
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Radius is: " + getRadius() + ", have a color: " + getColor();
    }

    @Override
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
