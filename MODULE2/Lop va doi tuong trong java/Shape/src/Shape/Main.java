package Shape;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(1.0);
        circle.setColor("red");
        System.out.println(circle);
        System.out.println("---------------");

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(30);
        rectangle.setWidth(50);
        rectangle.setColor("violet");
        System.out.println(rectangle);
        System.out.println("---------------");
    }
}
