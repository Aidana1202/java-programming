package day30_arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        //array index 0 , 1 , 2 , 3 , 4  , 5  , 6  . 7, 8
        int[] data = {10, 20, 50, 70, 532, 999, 321, 3, 5454};
        for(int eachNum : data) {
            System.out.println(eachNum);
        }
        for(int n : data) {
            System.out.print(n + " ");
        }
        //
        System.out.println();
        for(int each = 0; each < data.length; each++ ) {
            System.out.println(data[each]);
        }
        // last value in array using length
                                // 9 - 1 = 8
        System.out.println(data[data.length - 1]);
        //
        for(int idx = data.length - 1; idx >= 0; idx--){
            System.out.print(data[idx] + " ");
        }

    }
}
