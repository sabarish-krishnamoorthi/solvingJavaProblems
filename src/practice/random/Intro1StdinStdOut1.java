package practice.random;

import java.util.*;

/*
 * Task
In this challenge, you must read 3 integers from stdin and then print them to stdout.
 Each integer must be printed on a new line. 
*/
public class Intro1StdinStdOut1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
