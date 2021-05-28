package day43_list_custom_classes;

public class Employee {
    String name;
    String jobTitle;

    public void work() {
        System.out.println(name + " works as " + jobTitle);
    }

}

class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Aidana";
        employee1.jobTitle = "SDET";
        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);
        employee1.work();

        //
        Employee employee2 = new Employee();
        employee2.name = "Alex";
        employee2.jobTitle = "Roofer";
        System.out.println(employee2.name);
        System.out.println(employee2.jobTitle);
        employee2.work();

    }
}