package DaoNguocPhanTuCuaMang;

import java.util.Scanner;

public class DaoNguocPhanTuCuaMang {
    public static void main(String[] args) {
        int[]array = new int[6];

        int input;
        Scanner scanner = new Scanner(System.in);
//khoi tao mang va gan gia tri cho mang
        for (int i=0;i<array.length;i++){
            System.out.println("Nhap phan tu trong mang o vi tri: "+i);
            input = scanner.nextInt();
            array[i]=input;
        }
// in mang
        System.out.println("Mang duoc khoi tao la: ");
        for (int j = 0; j<array.length;j++){
            System.out.print(array[j]+",");
        }
// dao nguoc phan tu trong mang
        for (int i=0;i<array.length/2;i++){
            int temp = array[i];
            for (int j = array.length-i-1;j>=array.length-1-i;j--){
                array[i] = array[j];
                array[j] = temp;

            }
        }
// in mang dao nguoc
            System.out.println();
            System.out.println("Mang moi duoc tao sau khi dao nguoc la: ");
        for (int k =0;k<array.length;k++){
            System.out.print(array[k]+",");
        }

    }
}
