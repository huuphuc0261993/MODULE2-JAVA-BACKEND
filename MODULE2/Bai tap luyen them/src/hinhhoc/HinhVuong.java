package hinhhoc;

public class HinhVuong {
    private double canh;
    
    public HinhVuong(){

    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    

    public double dienTich(){
        return this.canh*this.canh;
    }

    public double chuVi(){
        return 4*this.canh;
    }

    public void print(){
        for (int i=0;i<this.canh;i++){
            for (int j=0;j<this.canh;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
