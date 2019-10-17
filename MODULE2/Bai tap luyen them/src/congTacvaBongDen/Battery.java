package congTacvaBongDen;

public class Battery {
    private int energy;

    public Battery() {
    }

    public Battery(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int decrease(){
        return this.energy--;
    }
}
