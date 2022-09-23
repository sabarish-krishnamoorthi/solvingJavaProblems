package challenges.daily;

import java.io.*;
import java.util.*;

/*
 * Task
Given an array,A , of N integers, print A's elements in reverse order as a single line of space-separated numbers.

Example
A=[1,2,3,4]
ß
Print 4 3 2 1. Each integer is separated by one space.
 */

public class Day7Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        bufferedReader.close();

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (0 == i) {
                System.out.print(arr.get(i));
            } else
                System.out.print(arr.get(i) + " ");
        }
    }
}
