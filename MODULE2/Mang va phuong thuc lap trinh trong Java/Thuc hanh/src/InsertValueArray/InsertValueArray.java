package InsertValueArray;

import java.util.Scanner;

public class InsertValueArray {
    public static void main(String[] args) {
        int[]array = {10,4,6,7,8,0,0,0,0,0};
        int insertNumber;
        int index;

        Scanner changeArray = new Scanner(System.in);
        System.out.println("Nhap gia tri ban muon chen vao mang: ");
        insertNumber = changeArray.nextInt();
        System.out.println("Nhap vi tri ban muon chen vao mang: ");
        index = changeArray.nextInt();

        System.out.println("mang khi chua duoc chen la: ");
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println();

        if (index<0 || index>=array.length-1){
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = array.length-1; i>index;i--){
                array[i] = array[i-1];
            }
            array[index]=insertNumber;

            System.out.println("Mang moi duoc khoi tao la: ");
            for (int i = 0; i<array.length;i++){
                System.out.print(array[i]+",");
            }
        }

    }
}
