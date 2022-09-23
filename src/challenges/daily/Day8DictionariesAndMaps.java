package challenges.daily;

import java.util.*;

/*
 * Given N names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
 *  You will then be given an unknown number of names to query your phone book for. 
 * For each NAME queried, print the associated entry from your phone book on a  new line in the form name=phoneNumber; 
 * if an entry for NAME is not found, print "Not found" instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.
 */
public class Day8DictionariesAndMaps {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (null == phoneBook.get(s)) {
                System.out.print("Not found");
                System.out.println();
            } else {
                System.out.print(s + "=" + phoneBook.get(s));
                System.out.println();
            }
        }
        in.close();
    }
}