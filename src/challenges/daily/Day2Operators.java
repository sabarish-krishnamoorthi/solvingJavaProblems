package challenges.daily;
/*
 * Task
Given the meal price (base cost of a meal),
 tip percent (the percentage of the meal price being added as tip), 
 and tax percent (the percentage of the meal price being added as tax) for a meal, 
 find and print the meal's total cost. Round the result to the nearest integer.
 * */

import java.io.*;
/*
 * Complete the 'solve' function below.
 *
 * The function accepts following parameters:
 *  1. DOUBLE meal_cost
 *  2. INTEGER tip_percent
 *  3. INTEGER tax_percent
 */
class Result {

	public static void solve(double meal_cost, int tip_percent, int tax_percent) {

		double pay = meal_cost + ((meal_cost * (tip_percent + tax_percent)) / 100);
		System.out.println(Math.round(pay));
	}

}

public class Day2Operators {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

		int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

		int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

		Result.solve(meal_cost, tip_percent, tax_percent);

		bufferedReader.close();
	}
}
