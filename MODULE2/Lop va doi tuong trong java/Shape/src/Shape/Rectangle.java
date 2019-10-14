package Shape;

public class Rectangle extends Shape{
    public double width;
    public double length;

//SET
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

//GET
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return this.width*this.length;
    }

    public double getPerimeter(){
        return 2*(this.width+this.length);
    }

    @Override
    public String toString(){
        return "A Rectangle with width= " + getWidth()
                +" and length= "
                + getLength()
                +", which is a subclass of "+super.toString();
    }

}
