package com.tka.shop;

import java.util.Scanner;

public class Login {

	static String unm, password;

	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unm");
		unm = sc.next();
		System.out.println("ENter password");
		password = sc.next();

		if (unm.equals("A") && password.equals("AA")) {
			System.out.println("Valid");
			System.out.println("Billamt=" + Purchase.purchase_product());

		} else
			System.out.println("Invalid");
	}

}
