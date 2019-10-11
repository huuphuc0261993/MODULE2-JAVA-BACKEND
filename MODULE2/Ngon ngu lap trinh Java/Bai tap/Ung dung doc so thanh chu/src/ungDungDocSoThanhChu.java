import java.util.Scanner;

public class ungDungDocSoThanhChu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so ban muon chuyen doi thanh chu: ");
        int n = scanner.nextInt();

        String str1;
        String str2;
        String str3;

        if (n==0 || n==00||n==000){
            System.out.print("khong");
        }else if (n%100==0){
            switch (n/100){
                case 1: str1 = "mot tram ";break;
                case 2: str1 = "hai tram ";break;
                case 3: str1 = "ba tram ";break;
                case 4: str1 = "bon tram ";break;
                case 5: str1 = "nam tram ";break;
                case 6: str1 = "sau tram ";break;
                case 7: str1 = "bay tram ";break;
                case 8: str1 = "tam tram ";break;
                case 9: str1 = "chin tram ";break;
                default:
                    str1 = "khong tim thay gia tri";
            }
            System.out.print(str1);
        }else if(n>=100 && n<1000){
            switch (n/100){
                case 1: str1 = "mot tram ";break;
                case 2: str1 = "hai tram ";break;
                case 3: str1 = "ba tram ";break;
                case 4: str1 = "bon tram ";break;
                case 5: str1 = "nam tram ";break;
                case 6: str1 = "sau tram ";break;
                case 7: str1 = "bay tram ";break;
                case 8: str1 = "tam tram ";break;
                case 9: str1 = "chin tram ";break;
                default:
                    str1 = "khong tim thay gia tri";
            }
            switch (((n-(n/100)*100))/10){
                case 0: str2 = "le "; break;
                case 1: str2 = "muoi ";break;
                case 2: str2 = "hai muoi ";break;
                case 3: str2 = "ba muoi ";break;
                case 4: str2 = "bon muoi ";break;
                case 5: str2 = "nam muoi ";break;
                case 6: str2 = "sau muoi ";break;
                case 7: str2 = "bay muoi ";break;
                case 8: str2 = "tam muoi ";break;
                case 9: str2 = "chin muoi ";break;
                default:
                    str2 = "khong tim thay gia tri";
            }
            switch (((n-(n/100)*100))%10){
                case 0: str3="";break;
                case 1: str3 = "mot ";break;
                case 2: str3 = "hai ";break;
                case 3: str3 = "ba ";break;
                case 4: str3 = "bon ";break;
                case 5: str3 = "nam ";break;
                case 6: str3 = "sau ";break;
                case 7: str3 = "bay ";break;
                case 8: str3 = "tam ";break;
                case 9: str3 = "chin ";break;
                default:
                    str3 = "khong tim thay gia tri";
            }
            System.out.print(str1 + str2 + str3);
        } else if(n<100 && n>=10){
            switch (n/10){
                case 1: str1 = "muoi ";break;
                case 2: str1 = "hai muoi ";break;
                case 3: str1 = "ba muoi ";break;
                case 4: str1 = "bon muoi ";break;
                case 5: str1 = "nam muoi ";break;
                case 6: str1 = "sau muoi ";break;
                case 7: str1 = "bay muoi ";break;
                case 8: str1 = "tam muoi ";break;
                case 9: str1 = "chin muoi ";break;
                default:
                    str1 = "khong tim thay gia tri";
            }
            switch (n%10){
                case 0: str2="";break;
                case 1: str2 = "mot ";break;
                case 2: str2 = "hai ";break;
                case 3: str2 = "ba ";break;
                case 4: str2 = "bon ";break;
                case 5: str2 = "nam ";break;
                case 6: str2 = "sau ";break;
                case 7: str2 = "bay ";break;
                case 8: str2 = "tam ";break;
                case 9: str2 = "chin ";break;
                default:
                    str2 = "khong tim thay gia tri";
            }
            System.out.print(str1 + str2);
        } else if(n<10 && n>=0){
            switch (n){
                case 0: str1 = "khong";break;
                case 1: str1 = "mot ";break;
                case 2: str1 = "hai ";break;
                case 3: str1 = "ba ";break;
                case 4: str1 = "bon ";break;
                case 5: str1 = "nam ";break;
                case 6: str1 = "sau ";break;
                case 7: str1 = "bay ";break;
                case 8: str1 = "tam ";break;
                case 9: str1 = "chin ";break;
                default:
                    str1 = "khong tim thay gia tri";
            }
            System.out.print(str1);
            }else {
            System.out.println("Gia tri nhap vao khong hop le");
        }
    }
}
