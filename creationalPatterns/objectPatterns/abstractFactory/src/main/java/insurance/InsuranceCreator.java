package insurance;

import model.PersonalInsurance;
import model.HomeInsurance;
import model.CarInsurance;
import insurance.CheapInsuranceCreator;
import insurance.ExpensiveInsuranceCreator;
import insurance.ScamInsuranceCreator;
import utils.InsuranceType;

public abstract class InsuranceCreator{
	
	public static InsuranceCreator createInsuranceCreator(InsuranceType type) {
		switch(type){
			case CHEAP:
				return new CheapInsuranceCreator();
			case EXPENSIVE:
				return new ExpensiveInsuranceCreator();
			case SCAM:
				return new ScamInsuranceCreator();
		}
		return null;
	}

	public abstract CarInsurance createCarInsurance();

	public abstract HomeInsurance createHomeInsurance();

	public abstract PersonalInsurance createPersonalInsurance();	
} 