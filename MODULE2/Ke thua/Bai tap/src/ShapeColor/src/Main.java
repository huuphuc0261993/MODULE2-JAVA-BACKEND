package ShapeColor.src;

public class Main {
    public static void main(String[] args) {

        Shape[]shapes = new Shape[2];
        shapes[0] = new Circle(5,"blue",true);
        shapes[1] = new Square(5,"red",true);

        for (int i=0; i<shapes.length; i++) {
            if (shapes[i] instanceof Colorable) {
                System.out.println(((Square) shapes[i]).howToColor());
            } else {
                System.out.println(shapes[i].toString());
            }
        }
    }
}
