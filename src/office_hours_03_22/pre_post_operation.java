package office_hours_03_22;

public class pre_post_operation {
    public static void main(String[] args) {
        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2;
        //    ( 3   + 2 ) * 2 / 3 % 2
        //         5 * 2 / 3 % 2
        //             10 / 3 % 2
        //             3 % 2
        //                 1

        // a = 2
        // b = 2
        // c = 1
        short c2 = (short)((a-- + b) * 2 / 3 % 2);
    }
}
