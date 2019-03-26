package homework2;

public class Task2 {
    public static void main(String[] args) {
        int n = 542;
        int devision = 10;
        int n1 = n%devision;
        int n3 = n/devision;
        int n2 = n3%devision;
        int n4 = n3/devision;

        int reversedNumber = n1*100 + n2*10 + n4;

        System.out.println(n - reversedNumber);
    }
}
