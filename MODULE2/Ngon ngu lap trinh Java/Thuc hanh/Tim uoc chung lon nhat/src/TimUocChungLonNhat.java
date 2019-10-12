import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a,b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap gia tri a: ");
        a = nhap.nextInt();
        System.out.println("nhap gia tri b: ");
        b = nhap.nextInt();

        if(a == 0 && b == 0){
            System.out.println("No greatest common factor");
        }


        while (a != b) {
            a = Math.abs(a);
            b = Math.abs(b);
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        System.out.println("Greatest common factor: " + a);
    }
}
