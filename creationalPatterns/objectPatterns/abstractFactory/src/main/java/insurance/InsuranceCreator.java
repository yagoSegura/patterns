package insurance;

import model.PersonalInsurance;
import model.HomeInsurance;
import model.CarInsurance;

public abstract class InsuranceCreator{
	
	public static InsuranceCreator createInsuranceCreator(String type) {
		return null;
	}

	public abstract CarInsurance createCarInsurance();

	public abstract HomeInsurance createHomeInsurance();

	public abstract PersonalInsurance createPersonalInsurance();	
} 