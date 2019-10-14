package Fan;

public class Fan {
    final int SLOW =1;
    final int MEDIUM =2;
    final int FAST =3;

    private int speed       = SLOW;
    private boolean on      = false;
    private double radius   = 5;
    private String color    = "blue";
//SETTER
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

//GETTER
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
         return (isOn()? "toc do cua quat la " + getSpeed()
                 + ", mau sac cua quat la " + getColor()
                 + ", ban kinh cua quat la " + getRadius()
                 + ", fan is on" : "mau sac cua quat la " + getColor()
                 + ", ban kinh cua quat la " + getRadius()
                 + ", fan is off" );
    }

}
