package userTask;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProcessListUsers {

    public static List<User> sortedListofUsers(List<User> list) {
        return list.stream().filter(Objects::nonNull)
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()) * -1)
                .collect(Collectors.toList());
    }

    public static List<User> listOfStudentsAgeUnder25(List<User> list) {
        return list.stream().filter(Objects::nonNull).filter(User::isStudent)
                .filter(user -> user.getAge() < 25).collect(Collectors.toList());
    }

    public static long countStudents(List<User> list) {
        return list.stream().filter(Objects::nonNull).filter(User::isStudent).filter(user -> user.getAge() < 15).count();
    }

    public static List<User> listNameGenderUppercase(List<User> list) {
        return list.stream().filter(Objects::nonNull).map(user -> new User(user.getName().toUpperCase(), user.getAge(),
                user.getGender().toUpperCase(), user.isStudent())).collect(Collectors.toList());
    }

    public static String allUsersAsString(List<User> list) {
        return list.stream().filter(Objects::nonNull).map(User::toString).collect(Collectors.joining(", "));
    }

    public static Map<String, List<User>> mapOfUsersByGender(List<User> list) {
        return list.stream().filter(Objects::nonNull).collect
                (Collectors.groupingBy(user -> user.getGender().toLowerCase()));
    }

    public static Map<Boolean, Map<String, List<User>>> mapOfUsersByStudent(List<User> list) {
        return list.stream().filter(Objects::nonNull).collect(Collectors.groupingBy(User::isStudent,
                Collectors.groupingBy(user -> user.getGender().toLowerCase())));
    }
}
