package com.atmproject;

import java.util.Scanner;

public class Atm_Complete_Project {
	public static void main(String[] args) {

		int pin = 1234;
		int balance = 10000;

		int AddAmount = 0;
		int TakeAmount = 0;

		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your pin number");
		int password = scanner.nextInt();

		if (pin == password) {
			System.out.println("Welcome Robin");

			while (true) {
				System.out.println("press 1 to check your account balance");
				System.out.println("press 2 to Add amount to your account");
				System.out.println("press 3 to take amount from your account");
				System.out.println("press 4 to take receipt");
				System.out.println("press 5 to EXIT");

				int opt = scanner.nextInt();
				if (opt < 5) {
					switch (opt) {
					case 1:
						System.out.println("your account balance is " + balance);
						break;

					case 2:
						System.out.println("How much amount did you want to add your account ");
						AddAmount = scanner.nextInt();
						balance = balance + AddAmount;
						System.out.println("Credited successfully you account balance " + balance);
						break;

					case 3:
						System.out.println("How much amount did you want to take from your account");
						TakeAmount = scanner.nextInt();
						if (TakeAmount > balance) {
							System.out.println("Account balance is insufficient");
						} else {
							balance = balance - TakeAmount;
							System.out.println("Debited successfully your account balance is " + balance);
						}
						break;

					case 4:
						System.out.println("welcome to all in one atm point");
						System.out.println("Added amount to your account " + AddAmount);
						System.out.println("Take Amount from your account " + TakeAmount);
						System.out.println("Your account balance is " + balance);
						System.out.println("Thank you");
						break;

					default:
						System.out.println("press number below 5");
						break;
					}
				} else {
					System.out.println("thank you");
					break;
				}

			}

		} else {
			System.out.println("wrong pin enter valid pin");
		}

	}
}
