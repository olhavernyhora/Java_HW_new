package task3;

public class Triangle {
    private double length1;
    private double length2;
    private double length3;
    private Point point1;
    private Point point2;
    private Point point3;
    private int numberOfTriangle;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, int numberOfTriangle) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
        this.numberOfTriangle = numberOfTriangle;
        calculateSideLength();
        if (!checkIfTriangle()){
            System.out.println("Unable to create a triangle number " + numberOfTriangle + ". Incorrect coordinates");
        }
    }

    public void calculateSideLength(){
        length1 = Math.sqrt(Math.pow(point1.getX() - point2.getX(),2) + Math.pow(point1.getY() - point2.getY(),2));
        length2 = Math.sqrt(Math.pow(point2.getX() - point3.getX(),2) + Math.pow(point2.getY() - point3.getY(),2));
        length3 = Math.sqrt(Math.pow(point1.getX() - point3.getX(),2) + Math.pow(point1.getY() - point3.getY(),2));
    }

    public boolean checkIfTriangle(){
        if(length1 < length2 + length3 && length2 < length1 + length3 && length3 < length2 + length1){
            return true;
        }
        return false;
    }

    public int getNumberOfTriangle() {
        return numberOfTriangle;
    }

    public boolean equilateralTriangle(){
        if (length1 == length2 && length2 == length3){
            return true;
        } else {
            return false;
        }
    }

    public boolean isoscelesTriangle(){
        if (length1 == length2 || length2 == length3 || length1 == length3 ){
            return true;
        } else {
            return false;
        }
    }

    public boolean rightangledTriangle(){
        double sqLength1 = length1*length1;
        double sqLength2 = length2*length2;
        double sqLength3 = length3*length3;
        if (sqLength1 == sqLength2 + sqLength3 || sqLength2 == sqLength1 + sqLength3
                || sqLength3 == sqLength2 + sqLength1 ){
            return true;
        } else {
            return false;
        }
    }

    public double getLength1() {
        return length1;
    }

    public double getLength2() {
        return length2;
    }

    public double getLength3() {
        return length3;
    }
}
