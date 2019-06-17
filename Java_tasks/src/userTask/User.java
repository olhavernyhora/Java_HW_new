package userTask;

public class User {

    private String name;
    private int age;
    private String gender;
    private boolean student;

    public User(String name, int age, String gender, boolean student) {
        if (userIsValid(name, age, gender)) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.student = student;
        } else throw new IllegalArgumentException(
                "Please enter valid data. User age has to be between 1 and 45. " +
                        "Gender - female or male. No null values are allowed.");
    }

    private boolean userIsValid(String name, int age, String gender) {
        return validateName(name) && validateAge(age) && validateGender(gender);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + gender.toLowerCase().hashCode();
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
        return this.gender.equalsIgnoreCase(other.gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (validateName(name)) {
            this.name = name;
        } else {
            System.out.println("Please enter valid name of user");
        }
    }

    private boolean validateName(String name) {
        return name != null && name.matches("[A-Za-z]+");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (validateAge(age)) {
            this.age = age;
        } else {
            System.out.println("Age has to be between 1 and 45 years.");
        }
    }

    private boolean validateAge(int age) {
        return age >= 1 && age <= 45;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (validateGender(gender)) {
            this.gender = gender;
        } else {
            System.out.println("Please enter valid gender - male or female");
        }
    }

    private boolean validateGender(String gender) {
        return gender != null && (gender.equalsIgnoreCase("male")
                || gender.equalsIgnoreCase("female"));
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
                ", student=" + student + "}";
    }
}
