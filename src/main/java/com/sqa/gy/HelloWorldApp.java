/*   File Name: HelloWorldApp.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 14, 2017
 *
 */

package com.sqa.gy;

import java.util.*;

import com.sqa.gy.helpers.*;

/*
 * HelloWorldApp
 *
 * @author      Yakovenko, Galina
 * @version     1.0.0
 * @since       1.0
 *
 */

public class HelloWorldApp {

	static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String nameOfUser, String appName) {
		System.out.println("Thanks for using " + appName + ".");
		System.out.println("Bye for now, " + nameOfUser + "!");
	}

	public static String greetUser(String appName) {
		System.out.println("Hello and welcome to the " + appName + " app.");
		System.out.print("What shall I call you? ");
		return scanner.nextLine();
	}

	public static void main(String[] args) {
		String userName;
		String nameOfApp = "Hello World";
		userName = greetUser(nameOfApp);
		AppBasics.doSomething(nameOfApp, "greeting you.");
		int age = Integer.parseInt(AppBasics.getUserInfo("How old are you? "));
		printUserAge(age);
		String color = AppBasics.getUserInfo("What\'s your favorite color? ");
		printUserColor(color);
		farewellUser(userName, nameOfApp);
	}

	private static void printUserAge(int age) {
		System.out.println("You are " + age + " years young!");
	}

	private static void printUserColor(String color) {
		// TODO: make color capitalized since it's the first word in a sent in
		// this print
		System.out
				.println(color.substring(0, 1).toUpperCase() + color.substring(1) + " is a very pretty color indeed!");
	}

}
