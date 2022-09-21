package practice.random;

import java.util.Scanner;

/*
 * Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

Output Format
In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 */
public class Intro3SOutPutFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// Complete this line
			System.out.printf("%-15s%03d%n", s1, x);
			/*
			 * % start of each input
			 * - left justified
			 * 15 digit
			 * s string
			 * 03 -- 3 digit fill with 0 
			 * d integer
			 */ 
			      
		}
		System.out.println("================================");
		sc.close();
	}
}

 

/*
Sample Input

java 100
cpp 65
python 50

Sample Output

================================
java           100 
cpp            065 
python         050 
================================
*/