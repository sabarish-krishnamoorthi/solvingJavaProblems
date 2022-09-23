package challenges.daily;

import java.util.Scanner;

/*
 * Task
Given a base-10 integer, N , convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 's in 's binary representation. When working with different bases, it is common to show the base as a subscript.

Example
N=125
The binary representation of 125 is 1111101. In base , there are 5 and 1 consecutive ones in two groups. 
Print the maximum, 5 .
 */
public class Day10BinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base10 = sc.nextInt();
        sc.close();
        int max = 0;
        int count = 0;
        while (base10 != 0) {
            if (base10 % 2 == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
            base10 = base10 / 2;
        }
        if (count > max) {
            max = count;
            count = 0;
        } else if (max == 0) {
            max = count;
        }
        System.out.println(max);
    }
}
