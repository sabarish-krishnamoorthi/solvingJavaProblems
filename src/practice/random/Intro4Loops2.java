package practice.random;
import java.util.*;

/*
 * Task
We use the integers a, b, and n to create the following series:
(a + (2 pow 0)* b), (a + (2 pow 0)* b + (2 pow 1) * b), ......... , (a + (2 pow 0)* b + (2 pow 1) * b + .... + (2 pow n-1) * b)
Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 */
public class Intro4Loops2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			double sum = 0;
			for (int j = 0; j < n; j++) {
				if (j == 0)
					sum = sum + a + (Math.pow(2, j) * b);
				else
					sum = sum + (Math.pow(2, j) * b);
				if (j != n - 1)
					System.out.print((int) sum + " ");
				else
					System.out.println((int) sum);
			}
		}
		in.close();

	}

}
