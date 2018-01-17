package application;

import utils.InsuranceType;
import insurance.InsuranceCreator;
import model.CarInsurance;
import model.HomeInsurance;
import model.PersonalInsurance;

public class InsuranceManager{
	
	public static void main(String args[]){

		// creation of cheap insurance 
		InsuranceCreator cheapInsuranceCreator = InsuranceCreator.createInsuranceCreator(InsuranceType.CHEAP);
		
		CarInsurance cheapCarInsurance = cheapInsuranceCreator.createCarInsurance();
		HomeInsurance cheapHomeInsurance = cheapInsuranceCreator.createHomeInsurance();
		PersonalInsurance cheapPersonalInsurance = cheapInsuranceCreator.createPersonalInsurance();

	}
}