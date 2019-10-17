package hinhhoc;

public class HinhHoc {
   private HinhChuNhat hinhChuNhat;
   private HinhTron hinhTron;
   private HinhVuong hinhVuong;

    public HinhHoc(HinhChuNhat hinhChuNhat, HinhTron hinhTron, HinhVuong hinhVuong) {
        this.hinhChuNhat = hinhChuNhat;
        this.hinhTron = hinhTron;
        this.hinhVuong = hinhVuong;
    }

    public HinhChuNhat getHinhChuNhat() {
        return hinhChuNhat;
    }

    public void setHinhChuNhat(HinhChuNhat hinhChuNhat) {
        this.hinhChuNhat = hinhChuNhat;
    }

    public HinhTron getHinhTron() {
        return hinhTron;
    }

    public void setHinhTron(HinhTron hinhTron) {
        this.hinhTron = hinhTron;
    }

    public HinhVuong getHinhVuong() {
        return hinhVuong;
    }

    public void setHinhVuong(HinhVuong hinhVuong) {
        this.hinhVuong = hinhVuong;
    }

    public double area(){
       return hinhChuNhat.dienTich()+hinhTron.dienTich()+hinhVuong.dienTich();
    }

}
