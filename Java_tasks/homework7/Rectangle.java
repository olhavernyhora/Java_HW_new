package homework7;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        if (width <= 0 || height <=0){
            System.out.println("You entered invalid size of rectangle side.");
            System.exit(0);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ": color=" + super.getColor();
    }

    @Override
    public double calcArea(){
        double area = width*height;
        return area;
    }
}
