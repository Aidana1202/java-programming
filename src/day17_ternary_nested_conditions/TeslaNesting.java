package day17_ternary_nested_conditions;

public class TeslaNesting {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "Long range";
        if (model == 'S') {
            if (trim == "Long range") {
                System.out.println("range: 412\n Speed: 430 \n time: 4 sec");
            }
        }
    }
}
