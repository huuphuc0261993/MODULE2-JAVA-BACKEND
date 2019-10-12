package FindMin;

import java.util.Scanner;

public class FinMin {
    public static int findMin(int[]array){
    int min     = array[0];
    int index   = 0;
    for (int i = 0;i<array.length;i++){
        if (array[i]<min){
            min = array[i];
            index = i;
        }
    }
    return index;
    }

    public static void main(String[] args) {
        int[]findArray = new int[5];
        int milion;
        Scanner input_money = new Scanner(System.in);

        for (int i =0;i<findArray.length;i++) {
            System.out.println("Nhap phan tu vao mang tai vi tri "+(i)+":");
            milion = input_money.nextInt();
            findArray[i]=milion;
        }
        int index = findMin(findArray);
        System.out.println("So nho nhat trong mang la " + findArray[index] );
    }
}
