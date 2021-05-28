package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,    150.0,    9.99,     250.0 ,    439.50,     39.99};
        int[] itemIDs =   {12345 ,   12346,    12347,    12348,     12349,       12350};
        System.out.println("--------FIND THE INDEX OF 'GLOVES' IN ITEMS ARRAY------");

        int index = 0;
        for(int i = 0; i < items.length; i++) {
            if(items[i].equals("Gloves")) {
                index += i;
                System.out.println("Gloves found at index - " + index);
                break;
            }
        }
        //
        System.out.println("-----Set boolean to true if first 'IPad' is found-----");
        boolean iPadExists = false;
        for(int i = 0; i < items.length; i++ ) {
            if(items[i].equalsIgnoreCase("iPad")) {
                iPadExists = true;
                break;
            }

            }
        System.out.println("iPadExists = " + iPadExists);
        //
        System.out.println("------Print a Report of each shopping item-----");
        for(int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - " + itemIDs[i]);
        }
        System.out.println("-----Look for 'Jacket' in items and print all details-----");
        for(int i = 0; i < items.length; i++){
            if(items[i].equals("Jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " - " + itemIDs[i]);
                break;
            }

        }
        double count = 99.99;
        int indexOfMaxPrice = 0;
        for(int i = 0; i< prices.length; i++) {
            if(count < prices[i]) {
                count = prices[i];
                indexOfMaxPrice = i;

            }

        }
        System.out.println(count + " " + indexOfMaxPrice);
        }



    }

