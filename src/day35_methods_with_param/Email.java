package day35_methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
        buildEmail("Aidana","paypal");
        buildEmail("Alex Ward 3", "verizon");
        buildEmail("Aidana Bai","Microsoft");

    }
    public static void buildEmail(String name, String domain) {
        name = name.replace(" ", "_").toLowerCase();
        domain = domain.toLowerCase();
        System.out.println(name + "@" + domain + ".com");
    }
}
