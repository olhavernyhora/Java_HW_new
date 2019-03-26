package homework2;

public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("Result:" + " a = " + a + "; b = " + b);
    }
}
