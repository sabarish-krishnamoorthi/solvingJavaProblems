package challenges.daily;

import java.util.*;

/*
 * Task
Given a string,S , of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format

The first line contains an integer, T (the number of test cases).
Each line i of the T subsequent lines contain a string, .

Example: Input 
2
Sabarish
Java

Example Output: 
Sbrs aaih
Jv aa
 */

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            char[] ch = s.toCharArray();

            for (int j = 0; j < ch.length; j++) {
                if (j % 2 == 0)
                    System.out.print(ch[j]);

            }
            System.out.print(" ");
            for (int j = 0; j < ch.length; j++) {
                if (j % 2 != 0)
                    System.out.print(ch[j]);
            }
            System.out.println();

        }

        sc.close();

    }
}
