package congTacvaBongDen;

public class SwitchButton {
    private boolean status;

    public SwitchButton() {
    }

    public SwitchButton(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
