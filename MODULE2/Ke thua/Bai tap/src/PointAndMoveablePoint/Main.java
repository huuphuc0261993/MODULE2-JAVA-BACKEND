package PointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5.0f);
        point.setY(5.3f);
        System.out.println(point);

        System.out.println("---------------");

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setxSpeed(3.0f);
        movablePoint.setySpeed(3.3f);
        movablePoint.setX(5.3f);
        movablePoint.setY(2.0f);
        System.out.println(movablePoint);

    }
}
