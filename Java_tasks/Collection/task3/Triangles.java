package task3;

import java.util.HashSet;

public class Triangles {
    private HashSet<Triangle> setOfTriangles;

    public Triangles() {
        this.setOfTriangles = new HashSet<>();
    }

    public void addTrianleToSet(Triangle triangle){
        if(triangle.checkIfTriangle()) {
            setOfTriangles.add(triangle);
        }
    }

    public String checkTriangleType() {
        String triangleTypes = "";
        for (Triangle tr : setOfTriangles) {
            if (tr.equilateralTriangle()) {
               triangleTypes += tr.getNumberOfTriangle() + " - triangle is " + "Equilateral; ";
            } else if (tr.isoscelesTriangle()) {
                triangleTypes += tr.getNumberOfTriangle() + " - triangle is " + "Isosceles; ";
            } else if (tr.rightangledTriangle()) {
                triangleTypes += tr.getNumberOfTriangle() + " - triangle is " + "Rightangled; ";
            } else {
                triangleTypes += tr.getNumberOfTriangle() + " - triangle is " + "Scalene; ";
            }
        }
        return triangleTypes;
    }
}
