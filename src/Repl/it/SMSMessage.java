package Repl.it;
import java.util.*;
public class SMSMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
        sender = message.substring(message.indexOf("<") +1 , message.indexOf(">"));

        phoneNumber = message.substring(message.indexOf("[") + 1 , message.indexOf("]"));

        messageBody = message.substring(message.indexOf("{") +1 , message.indexOf("}"));
        System.out.println("Sender: " + sender + "\nPhone number: " + phoneNumber + "\nMessage body: " + messageBody);
    }
}
