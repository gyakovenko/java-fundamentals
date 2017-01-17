/**
 *   File Name: FundamentalsApp.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 16, 2017
 *
 */

package com.sqa.gy;

import com.sqa.gy.helpers.*;

/**
 * FundamentalsApp - If Else
 *
 */
public class FundamentalsApp {

	public static void main(String[] args) {

		ifElseEx();
		switchEx();
		System.out.println("");
		System.out.println("");

		int twoNumberstoCompare[] = getTwoNumbersFromUser();
		compareIntToInt(twoNumberstoCompare[0], twoNumberstoCompare[1]);
		System.out.println("");
		System.out.println("");

		int userNumforMonth = Integer.parseInt(
				AppBasics.getUserInfo("Please enter a positive integer and I will give you the corresponding month: "));
		monthFromInt(userNumforMonth);
		System.out.println("");
		System.out.println("");

		double userGradeScore = Double.parseDouble(AppBasics.getUserInfo("Please enter your score: "));
		String letterGrade = makePercentToLetterGrade(userGradeScore);
		if (letterGrade != "NA") {
			printLetterGrade(letterGrade);
		}

	}

	/*
	 * Write a function which takes a int parameter and print the message on
	 * screen that <br> “number is greater than 10” otherwise it should print
	 * “number is smaller then 10”<br> (Can you support if parameter is equal to
	 * 10)
	 */

	private static void compareIntToInt(int int1, int int2) {
		if (int1 > int2) {
			System.out.println(int1 + " is greater than " + int2 + ".");
		} else if (int1 < int2) {
			System.out.println(int1 + " is less than " + int2 + ".");
		} else {
			System.out.println(int1 + " and " + int2 + " are equal.");
		}
	}

	private static int[] getTwoNumbersFromUser() {
		int[] twoNumbers = new int[2];
		twoNumbers[0] = Integer.parseInt(AppBasics.getUserInfo("You will enter two numbers to compare.\n" + // <br>
				"Please enter the first number: "));
		twoNumbers[1] = Integer.parseInt(AppBasics.getUserInfo("Please enter the second number: "));
		return twoNumbers;
	}

	private static void ifElseEx() {
		int num1, num2;
		num1 = 5;
		num2 = 8;

		if (num1 > 5) {
			System.out.println(num1 + " is greater than 5");
		} else {
			System.out.println(num1 + " is not greater than 5");
		}

		if (num2 > 5) {
			System.out.println(num2 + " is greater than 5");
		} else {
			System.out.println(num2 + " is not greater than 5");
		}
	}

	/*
	 * Write a program that can ask the user for a grade value and print the
	 * associated grade letter.
	 */
	private static String makePercentToLetterGrade(double userGradeScore) {
		if (userGradeScore > 100 || userGradeScore < 0) {
			System.out.println(
					"You did not enter a valid grade. Remember, there is no such thing as extra credit or a negative score.");
			return "NA";
		} else if (userGradeScore >= 90) {
			return "A";
		} else if (userGradeScore >= 80) {
			return "B";
		} else if (userGradeScore >= 70) {
			return "C";
		} else if (userGradeScore >= 60) {
			return "D";
		} else {
			return "F";
		}
	}

	/*
	 * Write a program that prints the name of month using switch statement
	 * given a number from the user. <br> You will need to use the
	 * Integer.parseInt() method to convert a user supplied string to a number
	 * <br> type variable that can be evaluated.
	 */
	private static void monthFromInt(int userNum) {
		int monthNum = userNum % 12;
		switch (monthNum) {
		case 1:
			System.out.println(userNum + " = January");
			break;
		case 2:
			System.out.println(userNum + " = Febuary");
			break;
		case 3:
			System.out.println(userNum + " = March");
			break;
		case 4:
			System.out.println(userNum + " = April");
			break;
		case 5:
			System.out.println(userNum + " = May");
			break;
		case 6:
			System.out.println(userNum + " = June");
			break;
		case 7:
			System.out.println(userNum + " = July");
			break;
		case 8:
			System.out.println(userNum + " = August");
			break;
		case 9:
			System.out.println(userNum + " = September");
			break;
		case 10:
			System.out.println(userNum + " = October");
			break;
		case 11:
			System.out.println(userNum + " = November");
			break;
		case 12:
			System.out.println(userNum + " = December");
			break;
		default:
			System.out.println("You did not enter a positive integer, so I do not have a corresponding month for you.");
			break;
		}
	}

	private static void printLetterGrade(String letterGrade) {
		String articleAorAn = "a";
		if (letterGrade == "A") {
			articleAorAn = "an";
		}
		System.out.println("You earned " + articleAorAn + " " + letterGrade + ".");
	}

	private static void switchEx() {
		int num1, num2;
		num1 = 5;
		num2 = 8;

		switch (num1) {
		case 5:
			System.out.println("Number is 5.");
			break;
		default:
			break;
		}
	}

}
