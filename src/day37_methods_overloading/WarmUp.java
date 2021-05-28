package day37_methods_overloading;

public class WarmUp {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123"); // POSITIVE TEST / SUNNY DAY
        loginVoid("cybertekStudent", "abs123"); // NEGATIVE TEST
        //System.out.println(loginVoid("cybertekStudent", "abc123")); // ERROR - VOID - NO RETURN VALUE
        //
        System.out.println(login("cybertekStudent", "abc123"));
    }
    public static void loginVoid(String username, String password) {
        String secretUsername ="cybertekStudent", secretPassword = "abc123";
        if(secretUsername.equalsIgnoreCase(username) && secretPassword.equalsIgnoreCase(password) ) {
            System.out.println("Login Successful, welcome Cybertek Student");
        }else{
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String name, String password) {
        String secretUsername ="cybertekStudent", secretPassword = "abc123";
        boolean log = true;
        if(name.equalsIgnoreCase(secretUsername) && password.equalsIgnoreCase(secretPassword) ) {
            return true;
        }else{
            return false;
    }

}
}
