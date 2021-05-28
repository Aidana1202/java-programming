package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";
        //String[] catsArray = cats.split(" ");
        int count = 0;
        for(int i = 0; i < cats.length() - 2; i++) {
            if(cats.substring(i, i +3).equals("cat")) {
                count++;
            }
        }
        System.out.println("cats count: " + count);
        //
        String catTypes = "bengal cat tabby cat persian cat no cat here";
        String[] catsArray1 = catTypes.split("cat");
        System.out.println("number of 'cat' = " + (catsArray1.length - 1));
        for(String type : catsArray1) {
            System.out.println(type);
        }

    }
}
