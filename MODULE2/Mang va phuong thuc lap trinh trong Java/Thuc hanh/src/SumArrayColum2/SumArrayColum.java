package SumArrayColum2;

import java.util.Random;
import java.util.Scanner;

public class SumArrayColum {
    public static void main(String[] args) {
        int random =100;
        int row = 3;
        int colum=4;
        int[][]matrix = new int[row][colum];
        int sum=0;
        int indexColum;
        Random rd = new Random();
// Truyen gia tri ngau nhien cho mang 2 chieu
        System.out.println("Mang duoc khoi tao la: ");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                matrix[i][j] = rd.nextInt(random);
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }
// Tinh tong mang 2 chieu
        System.out.println("Nhap cot ban muon cong tong:");
        Scanner input = new Scanner(System.in);
        indexColum = input.nextInt();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++) {
                if (indexColum == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("Tong cac so o cot "+indexColum+" la: "+sum);
    }
}
