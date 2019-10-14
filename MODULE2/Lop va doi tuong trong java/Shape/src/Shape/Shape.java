package Shape;

public class Shape {
    public String color = "green";
    public boolean filled = true;

//GET
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
//SET
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "A Shape with color of " + getColor()+" and "+ (isFilled() ? "filled ":" not filled");
    }

}
