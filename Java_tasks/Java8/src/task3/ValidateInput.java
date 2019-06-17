package task3;

public class ValidateInput {
    public static Person validData(String name, String genre, int age) {
        if (name != null && genre != null && age < 100 && age > 0) {
            return new Person(name, genre, age);
        } else {
            System.out.println("Please indicate valid information.");
            return null;
        }
    }
}


