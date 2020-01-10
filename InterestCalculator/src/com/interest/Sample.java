package com.interest;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		SBAccount sbaccount = new SBAccount();
		FDAccount fdaccount = new FDAccount();
		RDAccount rdaccount = new RDAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Interest Calculator – SB ");
		System.out.println("2. Interest Calculator – FD ");
		System.out.println("3. Interest Calculator – RD ");
		System.out.println("4. Exit");
		System.out.print("Enter your option (1..4):");
		int n = sc.nextInt();

		
		
		switch(n){
		case 1: 
			System.out.print("Enter the Average amount in your account:" );
			double sbamt = sc.nextDouble();
//			sbaccount.amount = sbamt;
			while(sbamt <0) {
				System.out.println("Invalid Amount. Please enter non-negative value");
				System.out.print("Enter the Average amount in your account:" );
				sbamt = sc.nextDouble();
			}
			sbaccount.amount = sbamt;
			System.out.print("Interest gained:" + sbaccount.calculateInterest());
			break;
		case 2:
			System.out.print("Enter the FD amount:" );
			double fdamt = sc.nextDouble();
//			fdaccount.amount = fdamt;
			while(fdamt <0) {
				System.out.println("Invalid Amount. Please enter non-negative value");
				System.out.print("Enter the FD amount:" );
				fdamt = sc.nextDouble();
			}
			fdaccount.amount = fdamt;	
			System.out.print("Enter the number of days:" );
			int noOfDays = sc.nextInt();
//			fdaccount.noOfDays = noOfDays;
			while(noOfDays <0) {
				System.out.println("Invalid Number of days. Please enter non-negative value");
				System.out.print("Enter the number of days:" );
				noOfDays = sc.nextInt();
			}
			fdaccount.noOfDays = noOfDays;
			System.out.print("Enter your age:" );
			int ageOfACHolder1 = sc.nextInt();
//			fdaccount.ageOfACHolder = ageOfACHolder1;
			while(ageOfACHolder1 <0) {
				System.out.println("Invalid Age of Account holder. Please enter non-negative value");
				System.out.print("Enter your age:" );
				ageOfACHolder1 = sc.nextInt();
			}
			
			fdaccount.ageOfACHolder = ageOfACHolder1;
			System.out.print("Interest gained:" + fdaccount.calculateInterest());
			break;
			
		case 3:
			System.out.print("Enter the RD amount:" );
			double rdamt = sc.nextDouble();
//			rdaccount.monthlyAmount = rdamt;
			while(rdamt <0) {
				System.out.println("Invalid Amount. Please enter non-negative value");
				System.out.print("Enter the RD amount:" );
				rdamt = sc.nextDouble();
			}
			fdaccount.amount = rdamt;	
			System.out.print("Enter the number of months:" );
			int noOfMonths = sc.nextInt();
//			rdaccount.noOfMonths = noOfMonths;
			while(noOfMonths <0) {
				System.out.println("Invalid Number of months. Please enter non-negative value");
				System.out.print("Enter the number of months:" );
				noOfMonths = sc.nextInt();
			}
			fdaccount.ageOfACHolder = noOfMonths;
			System.out.print("Enter your age:" );
			int ageOfACHolder2 = sc.nextInt();
//			rdaccount.ageOfACHolder = ageOfACHolder2;
			while(ageOfACHolder2 <0) {
				System.out.println("Invalid Age of Account holder. Please enter non-negative value");
				System.out.print("Enter your age:" );
				ageOfACHolder2 = sc.nextInt();
			}
			fdaccount.ageOfACHolder = ageOfACHolder2;
			System.out.print("Interest gained:" + rdaccount.calculateInterest() );
			break;
		
		case 4:
			System.out.println("Thanks for using calculator");
				break;
		default:
			System.out.println("Please enter number between 1 to 4");
		}
		
		sc.close();
	}
//	public static void issue(int num) {
//		while(num <0) {
//			System.out.println("Invalid Age of Account holder. Please enter non-negative value");
//			System.out.print("Enter the FD amount:" );
//			num = sc.nextInt();
//			
//		}
//	}
	
}
