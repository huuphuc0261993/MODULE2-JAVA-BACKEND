package Adam_Eva;

import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1. Adam noise");
        System.out.println("2. Eva noise");
        System.out.println("3. Adam eating");
        System.out.println("4. Eva eating");
        System.out.println("5. ShowInfo Person");
        System.out.println("6. ShowInfo Apple");
        System.out.println("7. Display menu");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    };
    public static void main(String[] args) {
        Person human1 = new Person("Adma",57,"male");
        Person human2 = new Person("Eva",45,"feMale");
        Apple food   = new Apple(20);
        int choice = -1;
        String str1 = "";

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Main.menu();
        while (choice!=0) {
            choice = sc.nextInt();
            if (choice == 1 || choice == 2) {
                str1 = sc1.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Adam noise: "+ human1.noise(str1));
                        break;

                    case 2:
                        System.out.print("Eva noise: "+ human2.noise(str1));
                        break;
                }
            } else if (choice == 3 || choice == 4) {
                if (food.getWeight() > 0) {
                    switch (choice) {
                        case 3:
                            human1.eat(food);
                            System.out.println("Weight Adam "+human1.getWeight());
                            break;

                        case 4:
                            human2.eat(food);
                            System.out.println("Weight Eva "+human2.getWeight());
                            break;
                    }
                } else {
                    System.out.println("Food is empty :)");
                }
            } else {
                switch (choice) {
                    case 5:
                        human1.showInfo();
                        human2.showInfo();
                        break;
                    case 6:
                        food.showInfoApple();
                        break;
                    case 7:
                        Main.menu();
                        break;
                    case 0:
                        System.out.println("You out program");
                        break;
                    default:
                        System.out.println("No choice!");
                }
            }
        }
    }
}
