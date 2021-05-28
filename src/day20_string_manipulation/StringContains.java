package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String city = "Miami city";
        System.out.println(city.contains("i")); // TRUE
        System.out.println(city.contains("ami")); // TRUE
        System.out.println(city.contains("Mi")); // TRUE
        System.out.println(city.contains("i c") ); // TRUE
        System.out.println(city.contains("City")); // FALSE because CASE SENSITIVE

        if (city.contains(" ")) {
            System.out.println("Multiple word - " + city);
        } else {
            System.out.println("Single word");
        }
        //
        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains("|")) {
            System.out.println("Pass"); // PASS
        } else {
            System.out.println("Fail");
        }
        //
        String firstName = "Aidana";
        if(firstName.contains("A") && firstName.contains("d")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");     // YES
        }
        //
        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("pass");
        } else {
            System.out.println("fail");    //PASS
        }
        //
        String email = "dana12021996@gamil.com";
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");    // CORRECT
        }
        //
        if(email.toLowerCase().contains("d")) {
            System.out.println("d is present");     //CHAINING from lower case and then check
        } else {
            System.out.println("d is not present");
        }
        //





    }
}
