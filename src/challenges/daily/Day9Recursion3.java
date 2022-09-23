package challenges.daily;

import java.util.*;

class Factorial {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Write your code here
        int output = 1;
        for (int i = n; i >= 1; i--) {
            output = output * i;
        }
        return output;
    }
}

public class Day9Recursion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int result = Factorial.factorial(n);

        System.out.println(result);
    }
}
