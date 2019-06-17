package task3;

public class Main {
    public static void main(String[] args) {
        FilterStream stream = new FilterStream();
        System.out.println(stream);

        String female = "female";
        String male = "male";

        Person first = ValidateInput.validData(null, male, 17);
        Person second = ValidateInput.validData("Tom", null, 30);
        Person sixth = ValidateInput.validData("Tom", male, 55);
        Person seventh = ValidateInput.validData("Jackson", male, 42);
        Person third = ValidateInput.validData("Jane", female, 20);
        Person forth =ValidateInput.validData("Landon", male, 68);
        Person fifth = ValidateInput.validData("Kira", female, 18);

        FilteringList list = new FilteringList(first, second, seventh, sixth, third, forth, fifth);

        list.getWomenAvrAge();
        list.getListOfMenForService();


    }
}
