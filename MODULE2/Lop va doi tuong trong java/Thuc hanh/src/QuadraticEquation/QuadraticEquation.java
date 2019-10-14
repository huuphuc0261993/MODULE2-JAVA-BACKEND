package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {

    private double a,b,c;
public QuadraticEquation(double a, double b, double c){
    this.a =a;
    this.b =b;
    this.c =c;
}
    public double getDiscriminant() {
        return this.b*this.b-4*this.a*this.c;
    }
    public double getRoot1(){

    return (-this.b+Math.pow((Math.pow(this.b,2)-4*this.a*this.c),0.5))/(2*this.a);
}
    public double getRoot2(){
        return (-b-Math.pow((Math.pow(this.b,2)-4*this.a*this.c),0.5))/(2*this.a);
    }

    public static void main(String[] args) {

    Scanner equation = new Scanner(System.in);
    double a,b,c;
        System.out.println("nhap a");
    a = equation.nextDouble();
        System.out.println("nhap b");
    b = equation.nextDouble();
        System.out.println("nhap c");
    c = equation.nextDouble();

    QuadraticEquation name = new QuadraticEquation(a,b,c);
    if(name.getDiscriminant()>0) {
        System.out.println("nghiem x1 cuar phuong trinh la: " + name.getRoot1());
        System.out.println("nghiem x2 cuar phuong trinh la: " + name.getRoot2());
    } else if(name.getDiscriminant()<0){
        System.out.println("phuong trinh vo nghiem");
    } else if(name.getDiscriminant()==0){
        System.out.println("phuong trinh co nghiem kep: "+-b/2*a);
    } else {
        System.out.println("Phuong trinh vo nghiem");
    }

    }

}
