import java.sql.SQLOutput;
import java.util.Scanner;

public class phuongTrinhBacNhat {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        a = scanner.nextDouble();

        System.out.print("b: ");
        b = scanner.nextDouble();

        if (a!=0){
            double answer = -b/a;
            System.out.println(" nghiem cua phuong trinh bac nhat la: "+answer);
        } else if (a==0 && b==0) {
            System.out.println("phuong trinh co vo so nghiem");
        } else{
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
