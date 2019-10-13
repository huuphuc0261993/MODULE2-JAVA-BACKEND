package Game_MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        int random=10;
        int row;
        int colum;
        int boom;

//        Random rd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so hang trong mang: ");
        row     = input.nextInt();
        System.out.println("Nhap so cot trong mang: ");
        colum     = input.nextInt();
        System.out.println("Nhap so boom trong mang: ");
        boom     = input.nextInt();
//Truyen gia tri cho mang
        System.out.println("Mang duoc khoi tao la: ");
        String[][]matrix = new String[row][colum];
        for (int i=0;i<matrix.length;i++){
            for (int j=0; j<matrix[i].length;j++){
                matrix[i][j]=".";
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
