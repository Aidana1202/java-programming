package day33_Arrays;

public class GroupFriends {
    public static void main(String[] args) {
        String friends = "Aidana, Yaroslav, Diana, Andrey, Gulnaz";
        String[] friendsArray = friends.split(",");

        for (String each : friendsArray) {
            System.out.println("Happy Holoday, " + each + "!");
        }

    }
}
