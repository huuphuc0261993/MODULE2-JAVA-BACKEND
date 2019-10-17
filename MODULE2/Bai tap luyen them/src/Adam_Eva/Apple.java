package Adam_Eva;

public class Apple {
    private int weight;

    public Apple() {
    }

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int decrease(){
        return this.weight--;
    }

    public boolean isEmpty(){
        return false;
    }

    public void showInfoApple(){
        System.out.println(" Apple Info: ");
        System.out.println("- Number apple:"+ this.getWeight());

    }
}
