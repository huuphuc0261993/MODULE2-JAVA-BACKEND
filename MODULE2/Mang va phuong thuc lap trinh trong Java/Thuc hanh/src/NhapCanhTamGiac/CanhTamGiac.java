package NhapCanhTamGiac;

import java.util.Scanner;

public class CanhTamGiac {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,c;

        System.out.println("nhap canh b: ");
        b = input.nextInt();
        System.out.println("nhap canh c: ");
        c = input.nextInt();

        try{
            System.out.println("nhap canh a: ");
            a = input.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("3 canh khong phai canh cua 1 tam giac");
        }
//        if(a>0 && b >0 && c>0 &&(a+b > c || a+c > b || b+c > a)) {
//            System.out.println("a,b,c la 3 canh cua 1 tam giac");
//        }
    }
}
