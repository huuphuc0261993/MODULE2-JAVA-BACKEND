package hinhhoc;

public class HinhTron {
    private double banKinh;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double dienTich(){

        return Math.PI*this.banKinh*this.banKinh;
    }

    public double chuVi(){
        return 2*Math.PI*this.banKinh;
    }

    public void print(){
        System.out.println("*");
    }
}
