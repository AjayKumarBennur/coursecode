package com.te.mockproblems.exceptions;

import java.util.Scanner;

public class PhoneNumberCheck {
	public static void main(String[] args) {
		System.out.println("Enter the phone number");
		Scanner scanner = new Scanner(System.in);
		String phoneNo = scanner.next();
		if(phoneNo.length()==10) {
			System.out.println(phoneNo);
		}else {
			//ValidPhoneNumber ex= new ValidPhoneNumber("Enter Valid Number");
			//throw ex;
		}
	}
}
