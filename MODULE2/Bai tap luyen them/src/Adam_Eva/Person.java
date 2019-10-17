package Adam_Eva;

public class Person {
    private String name;
    private double weight;
    private String gender;


    public Person() {
    }

    public Person(String name, double weight, String gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String noise(String str){
        return str;
    }

    public void eat(Apple apple){
        this.weight++;
        apple.decrease();
    }

    public void showInfo(){
        System.out.println(this.name+" Info: ");
        System.out.println("- Name \t\t:"+ this.name);
        System.out.println("- Gender \t:"+ this.gender);
        System.out.println("- Weight \t:"+ this.weight);
    }
}
