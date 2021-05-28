package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println(fullName());
        System.out.println("Is married ? " + isMarried());
        System.out.println(getAge());
        //
        System.out.println(getRandomYear());
        System.out.println(getRandomYear());
        //
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int rand = getRandomYear();
        System.out.println(name + " " + married + " " + age + " " + rand);
        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("rand = " + rand);

    }
    public static String fullName() {
        System.out.println("inside FullName method");
        return "Aidana Baimukhambet";
    }
    //
    public static boolean isMarried() {
        return true;
    }
    //
    public static int getAge() {
        int age = 24;
        return age;
    }
    //
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
