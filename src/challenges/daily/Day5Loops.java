package challenges.daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Input Format

A single integer, n.

Constraints 2<=n<=20

Output Format

Print 10  lines of output; each line i (where 1<=i<=10 ) contains the result of n x i in the form:
n x i = result.
 */
public class Day5Loops {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		// your code
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}

		bufferedReader.close();
	}

}

/*
Sample Input :
2

Sample Output :
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/