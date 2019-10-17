package congTacvaBongDen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SwitchButton switchButton = new SwitchButton();
        ElectricLamp electricLamp = new ElectricLamp();
        Battery battery = new Battery();
        Scanner sc = new Scanner(System.in);
        int choice;
        int count = 1;
        battery.setEnergy(10);

        System.out.println("0. Switch");
        System.out.println("1. Battery");
        System.out.println("2. Charge");;
        while (battery.getEnergy() != -1) {
            choice = sc.nextInt();
            count++;

            switch (choice) {
                case 0:
                    if (count % 2 == 0) {
                        switchButton.setStatus(true);
                    } else {
                        switchButton.setStatus(false);
                    }

                    if (switchButton.isStatus() && battery.getEnergy() != 0) {
                        System.out.println("The light is on");

                        battery.decrease();

                    } else {
                        System.out.println("The light is off");
                    }

                    break;
                case 1:
                    System.out.println("Present battery is: " + battery.getEnergy());
                    break;
                case 2:
                    battery.setEnergy(10);
                    System.out.println("Battery is charged, battery: "+battery.getEnergy());
                    break;
                default:
                    System.out.println("No choice!");
            }

        }

    }
}
