package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public void email() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Email of User: ");
		String eMail = sc.next();
		boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", eMail);
		if (check)
			System.out.println("Perfect! Email!");
		else
			System.out.println("Please Enter a Valid Email");
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		System.out.println("Welcome to User Registration Program");

		user.email();
	}
}
