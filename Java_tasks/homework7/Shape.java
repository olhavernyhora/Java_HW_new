package homework7;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    @Override
    public String toString(){
        return "class=...: color=...";
    }

    public double calcArea(){
        return 0.0;
    }

    public String getColor() {
        return color;
    }
}
