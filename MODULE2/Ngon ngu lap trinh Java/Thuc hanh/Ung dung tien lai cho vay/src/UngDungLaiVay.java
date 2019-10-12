import java.text.DecimalFormat;
import java.util.Scanner;

public class UngDungLaiVay {
    public static void main(String[] args) {
        double pay;
        int loan;
        int month;
        double interest_rate;

        Scanner bank = new Scanner(System.in);
        DecimalFormat formater = new DecimalFormat("#,###");

        System.out.println("So tien ban muon vay la: ");
        loan            = bank.nextInt();
        System.out.println("Hay nhap ky han ban muon vay(thang): ");
        month           = bank.nextInt();
        System.out.println("Hay nhap lai suat hien tai cua ngan hang(%/nam): ");
        interest_rate   = bank.nextDouble();

        pay = loan * ((interest_rate/100)/12)*month;
        System.out.println("So tien lai ban phai tra la: "+ formater.format(pay)+"VND");


    }
}
