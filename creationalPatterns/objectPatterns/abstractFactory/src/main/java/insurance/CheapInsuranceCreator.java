package insurance;

import insurance.InsuranceCreator;
import model.PersonalInsurance;
import model.HomeInsurance;
import model.CarInsurance;
import model.CheapCarInsurance;
import model.CheapHomeInsurance;
import model.CheapPersonalInsurance;

public class CheapInsuranceCreator extends InsuranceCreator{
	
	public CarInsurance createCarInsurance(){
		return new CheapCarInsurance();
	}

	public HomeInsurance createHomeInsurance(){
		return new CheapHomeInsurance();
	}

	public PersonalInsurance createPersonalInsurance(){
		return new CheapPersonalInsurance();
	}

}