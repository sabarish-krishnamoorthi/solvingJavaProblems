package practice.random;
import java.io.*;

/*
 * Task
Given an integer, N , print its first 10 multiples. Each multiple N x i  (where1 <= i <=10  ) 
should be printed on a new line in the form: N x i = result.

Input Format

A single integer, N .

Constraints: 2<= n <=20

Output Format

Print 10 lines of output; each line i (where 1<= i <=10 ) contains the  of N x  i in the form:
N x i = result.
 */
public class Intro4Loops1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());

		bufferedReader.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + N * i);
		}
	}

}