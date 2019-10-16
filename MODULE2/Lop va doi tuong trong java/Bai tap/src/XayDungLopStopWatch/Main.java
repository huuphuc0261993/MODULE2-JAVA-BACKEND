package XayDungLopStopWatch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;
        System.out.println("Nhap do dai cua mang");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();

        int[] arr = new int[length];
        System.out.println("Mang truoc khi chua duoc sap xep la: ");
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        System.out.println(Arrays.toString(arr));
        StopWatch time = new StopWatch();
        time.start();

//Thuc hien sap xep mang theo sort select;
        int minIndex, transfer;
        for (int i=0;i<length;i++){
            minIndex = i;
            for(int j=0;j<length;j++){
                if(arr[j]<arr[minIndex]){
                 minIndex = j;
                }
                if (i != minIndex) {
                    transfer = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = transfer;
                }
            }
        }
        System.out.println("Mang sau khi duoc sap xep la:");
        System.out.println(Arrays.toString(arr));
        time.end();
        System.out.println("Thoi gian duoc hien thi la: "+ time.getElapsedTime()+" mls");
    }
}
