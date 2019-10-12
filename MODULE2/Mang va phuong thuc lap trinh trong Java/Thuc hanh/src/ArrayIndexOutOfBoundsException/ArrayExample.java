package ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static int[] creatRandom(){
        Random rd = new Random();
        int[]arr = new int[100];
        System.out.println("Danh sach phan tu mang la: ");
        for (int i=0;i<100;i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ ",");
        }
        return arr;
    }

    public static void main(String[] args) {
        int index;
        ArrayExample arrayExample = new ArrayExample();
        int[]arr = arrayExample.creatRandom();
        Scanner findName = new Scanner(System.in);
        System.out.println("nhap vi tri ban muon tim trong mang: ");
        index = findName.nextInt();

        try {
            System.out.println("Gia tri phan tu co chi so " + index + " la " + arr[index]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
        }
    }

