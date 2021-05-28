package day20_string_manipulation;

public class LoginTest2 {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String username = "CYBERTEK";
        String password = "abc123";

        if (expUserName.equalsIgnoreCase(username) && expPassword.equals(password)) {
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