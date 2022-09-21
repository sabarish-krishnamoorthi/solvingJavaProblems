package practice.random;

import java.util.*;

/*
 * Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 * 
 * Input Format

The first line contains an integer, T, denoting the number of test cases.
Each test case, T , is comprised of a single line with an integer, N , which can be arbitrarily large or small.

Output Format

For each input variable N and appropriate primitive dataType, you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
* 
* If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).


 */

public class Intro5DataTypes {
	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			try {
				long N = sc.nextLong();
				System.out.println(N + " can be fitted in:");
				if (N >= -128 && N <= 127)
					System.out.println("* byte");
				// Complete the code
				if (N >= Short.MIN_VALUE && N <= Short.MAX_VALUE)
					System.out.println("* short");
				if (N >= Integer.MIN_VALUE && N <= Integer.MAX_VALUE)
					System.out.println("* int");
				if (N >= Long.MIN_VALUE && N <= Long.MAX_VALUE)
					System.out.println("* long");
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
		sc.close();
	}
}

/*
 * Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
 */
   



