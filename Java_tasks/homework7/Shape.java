package homework7;

public abstract class Shape implements Drawable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ": color=" + color;
    }

    abstract public double calcArea();

    public String getColor() {
        return color;
    }

    @Override
    public  void draw(){
        System.out.println(toString() + "-> area=" + this.calcArea());
    }
}
