package TongDuongCheoHinhVuong;

import java.util.Random;
import java.util.Scanner;

public class TongDuongCheoHinhVuong {
    public static void main(String[] args) {
        int random=10;
        int index;
        int colum;
        int sum=0;

        Random rd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so hang va cot trong 1 mang: ");
        index     = input.nextInt();
//Truyen gia tri cho mang
        System.out.println("Mang duoc khoi tao la: ");
        int[][]matrix = new int[index][index];
        for (int i=0;i<matrix.length;i++){
            for (int j=0; j<matrix[i].length;j++){
                matrix[i][j]=rd.nextInt(random);
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }
//Tinh tong duong cheo chinh
        for (int i=0;i<matrix.length;i++){
            for (int j=0; j<matrix[i].length;j++){
                if(i==j)
                sum=sum+matrix[i][j];
            }
        }
        System.out.println("Tong duong cheo chinh trong mang la: "+ sum);
    }
}
