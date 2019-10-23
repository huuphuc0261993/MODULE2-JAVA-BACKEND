package HinhHoc;

public class Main {
    public static void main(String[] args) {

        Shape[]arr = new Shape[3];
        arr[0] = new Rectangle(10,2);
        arr[1] = new Circle(5);
        arr[2] = new Square(5);

        System.out.println("Before Area increase :");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i].resize(0));
        }
        System.out.println("----------------");
        System.out.println("After Area increase :");
        double random = Math.random();
        System.out.println(random);

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i].resize(random));
        }
    }
}
