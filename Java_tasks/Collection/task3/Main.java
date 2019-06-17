package task3;

public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(3,2, 7,5,0,0, 1);
        Triangle tr2 = new Triangle(0,6, 6,0,0,0, 2);
        Triangle tr3 = new Triangle(2,6, 11,5,7,12, 3);
        Triangle tr4 = new Triangle(0,0, 10,0,0,15, 4);

        Triangles trSet = new Triangles();
        trSet.addTrianleToSet(tr1);
        trSet.addTrianleToSet(tr2);
        trSet.addTrianleToSet(tr3);
        trSet.addTrianleToSet(tr4);

        System.out.println(trSet.checkTriangleType());
    }
}
