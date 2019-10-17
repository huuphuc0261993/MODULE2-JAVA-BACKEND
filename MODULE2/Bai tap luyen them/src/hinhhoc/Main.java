package hinhhoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice=-1;
        Scanner scanner         =   new Scanner(System.in);
        HinhHoc hinhHoc         =   new HinhHoc(new HinhChuNhat(10,4),new HinhTron(6),new HinhVuong(5));
        while (choice!=0) {
            System.out.println("Menu");
            System.out.println("1. Hinh Chu Nhat");
            System.out.println("2. Hinh Vuong");
            System.out.println("3. Hinh Tron");
            System.out.println("4. Tong dien tich");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Dien tich: "+hinhHoc.getHinhChuNhat().dienTich());
                    hinhHoc.getHinhChuNhat().print();
                    break;

                case 2:
                    System.out.println("Dien tich: "+hinhHoc.getHinhVuong().dienTich());
                    hinhHoc.getHinhVuong().print();
                    break;

                case 3:
                    System.out.println("Dien tich: "+hinhHoc.getHinhTron().dienTich());
                    hinhHoc.getHinhTron().print();
                    break;
                case 4:
                    double tong;
                    tong = hinhHoc.area();
                    System.out.println("Tong dien tich: " + tong);
                    break;
                case 0:
                    System.out.println(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
