package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String username = "CYBERTEK";
        String password = "abc123";

        if (expUserName.equalsIgnoreCase(username) && expPassword.equals(password) ) {
            System.out.println("Correct");
        } else {
            if (!expUserName.equalsIgnoreCase(username)) {
                System.out.println("User name incorrect try again!");
            } else {
                System.out.println("Password incorrect, please try again");

            }
        }
    }
}
