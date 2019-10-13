package RemoveValueArray;

import java.util.Scanner;

public class RemoveValueArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int removetNumber;
        int index;

        System.out.println("mang khi chua duoc xoa la: ");
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println();

        Scanner changeArray = new Scanner(System.in);
        System.out.println("Nhap vi tri ban muon xoa khoi mang: ");
        index = changeArray.nextInt();

        if (index<0 || index>array.length-1){
            System.out.println("Không xoa được phần tử trong mảng");
        } else {
            for (int i = index; i<array.length-i; i++){
                array[i]=array[i+1];
        }
        }

        System.out.println("Mang sau khi duoc xoa la: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }
}
