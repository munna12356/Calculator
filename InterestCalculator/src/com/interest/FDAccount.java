package com.interest;

public class FDAccount extends Account{
	double interestRate;
	double amount;
	int noOfDays;
	int ageOfACHolder;
	@Override
	double calculateInterest() {
		if(noOfDays >= 7 && noOfDays <= 14 && amount < 10000000) {
			if(ageOfACHolder >=58) {
				interestRate = 5.0;
				return (amount * interestRate)/100;
			}else
			return (amount * 4.5)/100;
		}
		else if(noOfDays >= 15 && noOfDays <= 29 && amount < 10000000) {
			if(ageOfACHolder >=58) {
				return (amount * 5.25)/100;
			}else
			return (amount * 4.75)/100;
		}
		else if(noOfDays >= 30 && noOfDays <= 45 && amount < 10000000) {
			if(ageOfACHolder >=58) {
				return (amount * 6)/100;
			}else
			return (amount * 5.5)/100;
		}
		else if(noOfDays >= 45 && noOfDays <= 60 && amount < 10000000) {
			if(ageOfACHolder >=58) {
				return (amount * 7.5)/100;
			}else
			return (amount * 7)/100;
		}
		else if(noOfDays >= 61 && noOfDays <= 184 && amount < 10000000) {
			if(ageOfACHolder >=58) {
				return (amount * 8)/100;
			}else
			return (amount * 7.5)/100;
		}
		else if(noOfDays >= 185 && amount < 10000000) {
			if(ageOfACHolder >=58) {
				return (amount * 8.5)/100;
			}else
			return (amount * 8)/100;
		}
		else if(noOfDays >= 7 && noOfDays <= 14 && amount >= 10000000) {
				return (amount * 6.5)/100;
		     }
		else if(noOfDays >= 15 && noOfDays <= 45 && amount >= 10000000) {
					return (amount * 6.75)/100;
		     }
		
		
		else if(noOfDays >= 45 && noOfDays <= 60 && amount >= 10000000) {
					return (amount * 8)/100;
		     }else if(noOfDays >= 61 && noOfDays <= 184 && amount >= 10000000) {
					return (amount * 8.5)/100;
		     }else if(noOfDays >= 185 && amount >= 10000000) {
					return (amount * 10)/100;
		     }
				return 0;
		
	}
	
}
