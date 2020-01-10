package com.interest;

public class RDAccount extends Account{
	double interestRate;
	int ageOfACHolder;
	double amount;
	int noOfMonths;
	double monthlyAmount;
	
	@Override
	double calculateInterest() {
		
		if(noOfMonths <= 6) {
			if(ageOfACHolder >=58) {
				return (noOfMonths * monthlyAmount * 8)/100;
			}else
			return (noOfMonths * monthlyAmount * 7.5)/100;
		}
		else if(noOfMonths >=7 && noOfMonths <= 9 ) {
			if(ageOfACHolder >=58) {
				return (noOfMonths * monthlyAmount * 8.25)/100;
			}else
			return (noOfMonths * monthlyAmount * 7.75)/100;
		}
		else if(noOfMonths >=10 && noOfMonths <= 12 ) {
			if(ageOfACHolder >=58) {
				return (noOfMonths * monthlyAmount * 8.50)/100;
			}else
			return (noOfMonths * monthlyAmount * 8)/100;
		}
		else if(noOfMonths >=13 && noOfMonths <= 15 ) {
			if(ageOfACHolder >=58) {
				return (noOfMonths * monthlyAmount * 8.75)/100;
			}else
			return (noOfMonths * monthlyAmount * 8.25)/100;
		}
		else if(noOfMonths >=16 && noOfMonths <= 18 ) {
			if(ageOfACHolder >=58) {
				return (noOfMonths * monthlyAmount * 9)/100;
			}else
			return (noOfMonths * monthlyAmount * 8.50)/100;
		}
		else if(noOfMonths >=19) {
			if(ageOfACHolder >=58) {
				return (noOfMonths * monthlyAmount * 9.25)/100;
			}else
			return (noOfMonths * monthlyAmount * 8.75)/100;
		}
		return 0;
	}

}
