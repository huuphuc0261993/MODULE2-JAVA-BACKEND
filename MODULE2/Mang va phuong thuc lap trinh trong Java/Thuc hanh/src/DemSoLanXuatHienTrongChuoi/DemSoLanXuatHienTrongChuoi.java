package DemSoLanXuatHienTrongChuoi;

import java.util.Scanner;

public class DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        String name = "Where do you live?";
        int numberChar = name.length();
        char find;
        int count = 0;

        System.out.println("Chuoi cua ban la: "+ name);
        System.out.println("Nhap ky tu ban muon tim so lan xuat hien trong chuoi: ");
        Scanner input = new Scanner(System.in);
        find = input.next().charAt(0);

        for (int i=0; i<name.length();i++){
            if(find == name.charAt(i) ){
            count = count+1;
            }
        }
        System.out.println("So lan ky tu "+find+" xuat hien la: "+count);

    }
}
