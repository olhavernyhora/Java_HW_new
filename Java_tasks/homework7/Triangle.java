package homework7;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        if (a <= 0 || b <= 0 || c <= 0 || (a + b) < c || (a + c) < b || (b + c) < a) {
            System.out.println("You entered invalid size of triangle sides.");
            System.exit(0);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString(){
        return ("class=Triangle: color=" + super.getColor());
    }

    @Override
    public double calcArea() {
        double area;
        double p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
