package chap03;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        int number;

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("Day so nguyen to ban muon hien thi la: ");

        for ( int i = 2; i<=number;i++){
            if(i >=2) {
                int j = 2;
                boolean check = true;
                while (j <= Math.sqrt(i)) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                    j++;
                }
                if (check){
                    System.out.print(i+",");
                }
            }
        }
    }
}
