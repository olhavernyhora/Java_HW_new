package userTask;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = User.createUser("Jane", 12, "female", false);
        User user2 = User.createUser("Tom", 16, "male", true);
        User user3 = User.createUser("Odri", 21, "female", true);
        User user4 = User.createUser("Ruta", 25, "female", true);
        User user5 = User.createUser("Kolin", 44, "male", true);

        System.out.println(user1 + " " + user2 +" " + user3 + " " + user4 + " " + user5);

        ListOfUsers listUsers = new ListOfUsers(user1,user2,user3, user4, user5);
        System.out.println(listUsers.allUsersAsString());
        System.out.println(listUsers.countStudents());
        System.out.println(listUsers.listOfStudents());
        System.out.println(listUsers.mapOfUsersByGender());
        System.out.println(listUsers.sortedListofUsers());
        System.out.println(listUsers.mapOfUsersByStudent());
        System.out.println(listUsers.listNameGenderUppercase());
    }
}
