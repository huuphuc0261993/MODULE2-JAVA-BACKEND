package GopMang;

import java.util.Random;

public class GopMang {
    public static int[] creatRandom(int numberArray){
        int random =100;
        Random rd = new Random();
        int[]arr = new int[numberArray];
        for (int i = 0; i<arr.length;i++){
            arr[i] = rd.nextInt(random);;
        }
        return arr;
    }

    public static void main(String[] args) {
// khoi tao 2 mang bang cach su dung lop GopMang da duoc tao
        GopMang arrayExample = new GopMang();
        int[]arr1 = arrayExample.creatRandom(6);
        int[]arr2 = arrayExample.creatRandom(7);
//in mang
        System.out.println("Mang 1 gom cac phan tu la: ");
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+",");
        }
        System.out.println();
        System.out.println("Mang 2 gom cac phan tu la: ");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+",");
        }
//Noi mang
        int[]arr3 = new int[arr1.length+arr2.length];
        for (int i=0; i<arr1.length; i++){
            arr3[i]=arr1[i];
            for (int j=0;j<arr2.length;j++){
                arr3[arr1.length+j]=arr2[j];
            }
        }
        System.out.println();
        System.out.println("Mang moi duoc gop la: ");
        for (int k=0;k<arr3.length;k++){
            System.out.print(arr3[k]+",");
        }
    }
}
