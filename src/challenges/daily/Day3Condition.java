package challenges.daily;

import java.io.*;

/*
 * Task
Given an integer, , perform the following conditional actions:

If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5, print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If N is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not N is weird.

Constraint  : 1<= N <= 100  //Input range

*/

public class Day3Condition {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());

		bufferedReader.close();

		// If something modulus 2 is zero then its a even number
		if (N % 2 == 0) { // N is even
			if (N <= 5) {
				System.out.println("Not Weird"); // in the inclusive range of 2 to 5
			} else if (N <= 20) {
				System.out.println("Weird"); // in the inclusive range of 6 to 20
			} else {
				System.out.println("Not Weird"); // greater than 20
			}

		} else { // N is Odd
			System.out.println("Weird");
		}
	}
}
