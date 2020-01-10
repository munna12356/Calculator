package com.interest;

public class SBAccount extends Account{
	double interestRate;
	double amount;
//	String accountholder = "";


	@Override
	double calculateInterest() {
//		if(accountholder == "NRI") {
			interestRate = 4;
			double interest = (interestRate * amount)/100;
		return interest;
//		}
//		interestRate = 6;
//		return (interestRate *  amount)/100;
	}

}
