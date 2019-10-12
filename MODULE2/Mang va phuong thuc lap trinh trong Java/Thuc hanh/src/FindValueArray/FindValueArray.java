package FindValueArray;

import java.util.Scanner;

public class FindValueArray {

    public static void main(String[] args) {
        String find = "";
        String[]Student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        System.out.println("Import you want find name: ");
        Scanner findStudent = new Scanner(System.in);
        String input_name = findStudent.nextLine();
        boolean isExits = false;

        for (int i=0;i<Student.length;i++){
            if (Student[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExits =true;
                break;
            }
        }
        if (!isExits){
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
