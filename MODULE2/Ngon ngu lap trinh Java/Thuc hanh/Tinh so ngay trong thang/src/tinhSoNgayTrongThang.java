import java.util.Scanner;

public class tinhSoNgayTrongThang {
    public static void main(String[] args) {
        System.out.println("Enter your month: ");
        int month;
        Scanner scanner = new Scanner(System.in);
        month = scanner.nextInt();
        System.out.println("so thang ban da nhap la: "+month);

        switch (month){
            case 2:
                System.out.println("thang "+ month+" co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang "+ month + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang "+ month + " co 30 ngay");
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}
