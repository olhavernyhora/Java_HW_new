package userTask;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfUsers {
    private List<User> listOfUsers;

    public ListOfUsers(User... user) {
        this.listOfUsers = new ArrayList<>();
        for (User u : user) {
            if (u != null) {
                listOfUsers.add(u);
            }
        }
    }

    public boolean addUserToList(User user) {
        if (user != null) {
            listOfUsers.add(user);
            return true;
        }
        return false;
    }

    public List<User> sortedListofUsers() {
        return listOfUsers.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()) * -1)
                .collect(Collectors.toList());
    }

    public List<User> listOfStudents(){
        return listOfUsers.stream().filter(User::isStudent).filter(user -> user.getAge() < 25)
                .collect(Collectors.toList());
    }

    public long countStudents(){
        return listOfUsers.stream().filter(User::isStudent).filter(user -> user.getAge() < 15).count();
    }

    public List<User> listNameGenderUppercase(){
        return listOfUsers.stream().map(user -> User.createUser(user.getName().toUpperCase(), user.getAge(),
                user.getGender().toUpperCase(), user.isStudent())).collect(Collectors.toList());
    }

    public String allUsersAsString(){
        return listOfUsers.stream().map(User::toString).collect(Collectors.joining(", "));
    }

    public Map<String, List<User>> mapOfUsersByGender(){
        return listOfUsers.stream().collect(Collectors.groupingBy(User::getGender));
    }

    public Map<Boolean, Map<String, List<User>>> mapOfUsersByStudent(){
        return listOfUsers.stream().collect(Collectors.groupingBy(User::isStudent,
                Collectors.groupingBy(User::getGender)));
    }


    //    Create List with 5 Users, Users list should contain 2 males, and 3 females, 4 students.
//    Age of users should be between 1 to 45 years;
//    Using streams filter and return:
//            1. A sorted List of Users by their names with ordering from Z to A;
//2. A List of students with age < 25;
//3. Count students with age > 15;
//4. A Map<String, List<User>>, where key = gender
//5. A Map<Boolean, Map<String, List<User>>, where a key = student, second map key = gender;
//6. A String, each userTask.User should be separated by the comma;
//7. A List where name and gender are uppercase;
}
