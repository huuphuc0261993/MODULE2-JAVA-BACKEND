import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        System.out.println("Enter you year: ");
        Scanner scanner = new Scanner((System.in));
        int year = scanner.nextInt();
        boolean isLeapYear= false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if (year % 400 ==0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear =true;
            }
        }

         if (isLeapYear){
             System.out.println(year + " is a Leap Year");
         } else {
             System.out.println(year + " is Not a Leap Year");
         }
        }
    }

