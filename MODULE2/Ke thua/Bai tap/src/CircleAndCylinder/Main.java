package CircleAndCylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.0);
        circle.setColor("red");
        System.out.println(circle);
        System.out.println("------------------");

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5.0);
        cylinder.setHeight(6.0);
        cylinder.setColor("blue");
        System.out.println(cylinder);
    }
}
