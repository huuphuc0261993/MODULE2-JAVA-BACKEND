import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    public static void main(String[] args) {
        int choice=-1;
        Scanner scanner = new Scanner(System.in);

        while (choice!=0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. Draw the triangle");
            System.out.println("5. Draw the triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //xay dung hinh thap trai
                    int numberOne = 1;
                    while (numberOne <= 5) {
                        for (int i = 1; i <= numberOne; i++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                        numberOne++;
                    }
                    System.out.println();
                    break;
                //xay dung hinh thap trai nguoc
                case 2:
                    int numberTwo = 1;
                    while (numberTwo <= 5) {
                        for (int i = 5; i >= numberTwo; i--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                        numberTwo++;
                    }
                    System.out.println();
                    break;
                //hinh chu nhat
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                //xay dung hinh thap ben phai
                case 4:
                    int numberThree = 1;
                    while ((numberThree <= 5)) {
                        for (int i = 1; i <= 5 - numberThree; i++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= numberThree; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                        numberThree++;
                    }
                    System.out.println();
                    break;
                //xay dung hinh thap ben phai nguoc
                case 5:
                    int numberFour = 1;
                    while (numberFour <= 5) {
                        for (int i = 1; i < numberFour; i++) {
                            System.out.print("  ");
                        }
                        for (int j = 5; j >= numberFour; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                        numberFour++;
                    }
                    break;
                //Exit
                case 0:
                    System.out.println(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

