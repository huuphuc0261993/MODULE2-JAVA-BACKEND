import java.text.DecimalFormat;
import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        final int RATE = 23000;
        int USD;

        DecimalFormat formater = new DecimalFormat("#,###");

        System.out.println("Nhap gia tri tien ban muon quy doi USD->VND:");
        Scanner scanner = new Scanner(System.in);
        USD = scanner.nextInt();

        System.out.println(USD +"$"+ " = "+ formater.format(USD*RATE)+"VND");
    }
}
