package chap02;

public class HienThiSoNguyeTo {
    public static void main(String[] args) {
        System.out.println("Day so nguyen to tu 1-100: ");
        for ( int i = 2; i<=100;i++){
             if(i >=2) {
                 int j = 2;
                 boolean check = true;
                 while (j <= Math.sqrt(i)) {
                     if (i % j == 0) {
                         check = false;
                         break;
                     }
                     j++;
                 }
                 if (check){
                     System.out.print(i+",");
                 }
             }
        }
    }
}
