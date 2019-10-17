package hinhhoc;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {

    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double dienTich() {

        return this.chieuDai * this.chieuRong;
    }

    public double chuVi() {
        return 2 * (this.chieuDai + this.chieuRong);
    }

    public void print() {
        for (int i = 0; i < getChieuRong(); i++) {
            for (int j = 0; j < getChieuDai(); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
