package userTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Jane", 12, "feMale", false);
        User user2 = new User ("Tom", 33, "mAle", true);
        User user3 = new User("Odri", 14, "female", true);
        User user31 = new User("Odri", 14, "female", true);
        User user4 = new User("Anna", 25, "female", true);
        User user5 = new User("tOm", 44, "male", true);
        System.out.println(user3.equals(user31));
//        List<User> listOfUsers = new ArrayList<>();
//        listOfUsers.add(user1);
//        listOfUsers.add(user2);
//        listOfUsers.add(user3);
//        listOfUsers.add(user4);
//        listOfUsers.add(null);
//
//        System.out.println(listOfUsers);
//        System.out.println(ProcessListUsers.sortedListofUsers(listOfUsers));
//        System.out.println(ProcessListUsers.countStudents(listOfUsers));
//        System.out.println(ProcessListUsers.listNameGenderUppercase(listOfUsers));
//        System.out.println(ProcessListUsers.listOfStudentsAgeUnder25(listOfUsers));
//        System.out.println(ProcessListUsers.allUsersAsString(listOfUsers));
//        System.out.println(ProcessListUsers.mapOfUsersByGender(listOfUsers));
//        System.out.println(ProcessListUsers.mapOfUsersByStudent(listOfUsers));


    }
}
