package homework7;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        if (radius <= 0){
            System.out.println("You entered invalid size of radius.");
            System.exit(0);
        }
        this.radius = radius;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ": color=" + super.getColor();
    }

    @Override
    public double calcArea(){
        double area = Math.PI*radius*radius;
        return area;
    }
}
