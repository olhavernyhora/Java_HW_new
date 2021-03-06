package homework7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {new Rectangle(12, 10, "Red"), new Rectangle(4,2.1, "Purple"),
                new Rectangle(6,3.5, "Blue"), new Rectangle(5.5, 2.3, "Yellow"),
                new Circle(2.3, "Pink"), new Circle(4, "Black"),
                new Circle(8.1, "Orange"), new Triangle(9, 5, 7.9, "Brown"),
                new Triangle(4, 5.5, 9, "Peach")};
        printShapes(shapes);
        System.out.println("==============");
        Arrays.sort(shapes, new CompareShapeByArea());
        printShapes(shapes);
        System.out.println("==============");
        Arrays.sort(shapes, new CompareShapeByColor());
        printShapes(shapes);

        System.out.println("Sum of areas of all shapes in an array = " + calculateAreas(shapes));

        System.out.println("Sum of areas of Circles = " + calculateAreasEachShape(shapes)[0] +
                "\nSum of areas of Triangles = " + calculateAreasEachShape(shapes)[1]
                + "\nSum of areas of Rectangles = " + calculateAreasEachShape(shapes)[2]);
    }
    public static void printShapes (Shape[] shapes) {
        for (Shape elem : shapes) {
            if (elem == null) {
                System.out.println("This figure is not defined yet");
            } else {
                elem.draw();
            }
        }
    }

    static double calculateAreas (Shape[]shapes){
        double squareArea = 0;
        for (Shape shape : shapes) {
            if (shape == null) {
                continue;
            } else {
                squareArea += shape.calcArea();
            }
        }
        return squareArea;
    }

    static double[] calculateAreasEachShape (Shape[]shapes){
        double[] areaEachShapeSum = new double[3];
        for (Shape shape : shapes) {
            if (shape == null) {
                continue;
            } else if (shape instanceof Circle) {
                areaEachShapeSum[0] += shape.calcArea();
            } else if (shape instanceof Triangle) {
                areaEachShapeSum[1] += shape.calcArea();
            } else if (shape instanceof Rectangle) {
                areaEachShapeSum[2] += shape.calcArea();
            }
        }
        return areaEachShapeSum;
    }

}
