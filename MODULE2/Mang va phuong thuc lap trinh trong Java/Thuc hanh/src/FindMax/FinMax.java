package FindMax;

import java.util.Scanner;

public class FinMax {
    public static int findMax(int[]array){
    int max     = array[0];
    int index   = 0;
    for (int i = 0;i<array.length;i++){
        if (array[i]>max){
            max = array[i];
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
            System.out.println("Nhap so tien cua ty phu "+(i+1)+":");
            milion = input_money.nextInt();
            findArray[i]=milion;
        }
        int index = findMax(findArray);
        System.out.println("Ty phu giau nhat la " + findArray[index] + " $");
    }
}
