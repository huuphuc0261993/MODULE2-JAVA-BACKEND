package congTacvaBongDen;

public class ElectricLamp {
    private boolean status = false;

    public ElectricLamp() {
    }

    public ElectricLamp(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
