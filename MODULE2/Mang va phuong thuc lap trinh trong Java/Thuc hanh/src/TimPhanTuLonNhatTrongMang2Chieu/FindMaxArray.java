package TimPhanTuLonNhatTrongMang2Chieu;

import java.util.Random;

public class FindMaxArray {
    public static void main(String[] args) {
        int random =100;
        int row = 3;
        int colum=4;
        int[][]matrix = new int[row][colum];

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
// Tim gia tri lon nhat trong mang 2 chieu
        int max = matrix[0][0];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong mang la: "+ max);
    }
}
