package Point2DAndPoint3D;

public class Main {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        point.setX(5.0f);
        point.setY(5.3f);
        System.out.println(point);

        System.out.println("---------------");

        Point3D movablePoint = new Point3D();
        movablePoint.setX(5.3f);
        movablePoint.setY(2.0f);
        movablePoint.setZ(1.0f);
        System.out.println(movablePoint);

    }
}
