package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Yaroslav] From Number<5082410031> Message: {Hello, lets code some java}";
        //System.out.println(message.substring(message.indexOf("[") + 1, message.indexOf("]")));
        //System.out.println( message.substring(message.indexOf("<") +1, message.indexOf(">")));
        //System.out.println(message.substring(message.indexOf("{") + 1, message.indexOf("}")));

        String name = message.substring(message.indexOf("[") + 1, message.indexOf("]"));
        String number =  message.substring(message.indexOf("<") + 1, message.indexOf(">"));
        String text =  message.substring(message.indexOf("{") + 1, message.indexOf("}"));

        System.out.println("name = " + name);
        System.out.println("number = " + number);
        System.out.println("text = " + text);

        String sender = " Aidana ";
        //REMOVE THE SPACES ON THE SIDES
        sender = sender.trim();
         if(sender.equals("Aidana")) {
             System.out.println("message from " + sender + " about quiz");
         } else {
             System.out.println("Someone else message");
         }



    }




}
