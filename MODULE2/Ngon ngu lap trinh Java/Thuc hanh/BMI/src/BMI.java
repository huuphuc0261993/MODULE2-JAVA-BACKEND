import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double BMI;
        double weight;
        double height;
        Scanner bmi = new Scanner(System.in);

        System.out.println("Import your weight(kg): ");
        weight = bmi.nextInt();
        System.out.println("Import your height(cm)");
        height = bmi.nextInt();

        BMI = weight/Math.pow(height/100,2);

        if (BMI<18.5){
            System.out.println("Your BMI is: "+BMI+" ,Underweight");
        } else if(BMI<25 && BMI>=18.5){
            System.out.println("Your BMI is: "+BMI+" ,Normal");
        } else if(BMI<30 && BMI>=25){
            System.out.println("Your BMI is: "+BMI+" ,Overweight");
        } else {
            System.out.println("Your BMI is: "+BMI+" ,Obese");
        }
    }
}
