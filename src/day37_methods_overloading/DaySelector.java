package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {

            System.out.println(i + " = " + day(i));
        }

    }
    public static String day(int num) {
        String day = "";
        if(num == 1) {
            day = "Monday";
        } else if (num == 2) {
            day = "Tuesday";
        }else if (num == 3) {
            day = "Wednesday";
        } else if (num == 4) {
            day = "Thursday";
        }else if (num == 5) {
            day = "Friday";
        }else if (num == 6) {
            day = "Saturday";
        }else if (num == 7) {
            day = "Sunday";
        } else {
            day = "Invalid day";
        }
        return day;
    }
}
