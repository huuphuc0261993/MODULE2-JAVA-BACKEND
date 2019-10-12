package DemSoSVDo;

import java.util.Scanner;

public class DemSoSVDo {
    public static void main(String[] args) {
        double point;
        double []score = new double[5];
        int count = 0;

        Scanner input_score = new Scanner(System.in);
        for (int i=0;i<score.length;i++) {
            int sum = i+1;
            System.out.println("nhap diem cua thi sinh thu "+ sum);
            point = input_score.nextDouble();
            score[i]=point;
        }
        System.out.println("Danh sach diem la: ");
        for (int j = 0;j<score.length;j++){
            System.out.print(score[j]+" ,");
            if(score[j]>5){
                count = count+1;
            }
        }
        System.out.println();
        System.out.println("So luong thi sinh dau la: "+count);
    }
}

