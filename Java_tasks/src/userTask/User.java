package userTask;

public class User {

    private String name;
    private int age;
    private String gender;
    private boolean student;

    private User(String name, int age, String gender, boolean student) {
        this.name = name.toLowerCase();
        this.age = age;
        this.gender = gender.toLowerCase();
        this.student = student;
    }

    // Validating user before creation
    public static User createUser(String name, int age, String gender, boolean student) {
        if (name != null && gender != null && age >= 1 && age <= 45
                && name.matches("[A-Za-z]+") &&
                (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            return new User(name, age, gender, student);
        } else {
            System.out.println("Please enter valid data. User age has to be between 1 and 45. " +
                    "Gender - female or male. No null values are allowed.");
        }
        return null;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + age;
        result = 31 * result + (student ? 1 : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (this.age != other.age)
            return false;
        if (this.student != other.student) {
            return false;
        }
        if (!this.name.equals(other.name)) {
            return false;
        }
        return this.gender.equals(other.gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.matches("[A-Za-z]+")) {
            this.name = name.toLowerCase();
        } else {
            System.out.println("Please enter valid name of user");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 45) {
            this.age = age;
        } else {
            System.out.println("Age has to be between 1 and 45 years.");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender != null && (gender.equalsIgnoreCase("male")
                || gender.equalsIgnoreCase("female"))) {
            this.gender = gender.toLowerCase();
        } else {
            System.out.println("Please enter valid gender - male or female");
        }
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age +
                ", gender='" + gender + '\'' +
                ", student=" + student + '}';
    }
}
