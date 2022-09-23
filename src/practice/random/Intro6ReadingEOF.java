package practice.random;

import java.util.Scanner;

/*
 * The challenge here is to read N lines of input until you reach EOF, then number and print all  lines of content.
 * Input Format

 * Read some unknown N lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

 * Output Format

 * For each line, print the line number, followed by a single space, and then the line content received as input.
 */
public class Intro6ReadingEOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;
        while (sc.hasNext()) {
            System.out.println(lineNumber + " " + sc.nextLine());
            lineNumber++;
        }
        sc.close();
    }
}