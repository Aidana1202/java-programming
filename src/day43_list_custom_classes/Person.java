package day43_list_custom_classes;
//firstName, age
public class Person {
    //Data - variables
    String firstName;
    int age;
    char gender;

    //behaviour
    public void speak() {
        System.out.println("Person is speaking");
    }
}
class People {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        //
        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 22;
        person2.gender = 'M';
        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);
    }
}
