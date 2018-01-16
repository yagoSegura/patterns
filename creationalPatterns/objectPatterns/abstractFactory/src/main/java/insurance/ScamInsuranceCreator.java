package insurance;

import insurance.InsuranceCreator;
import model.PersonalInsurance;
import model.HomeInsurance;
import model.CarInsurance;

public class ScamInsuranceCreator extends InsuranceCreator{

	public CarInsurance createCarInsurance(){return null;}

	public HomeInsurance createHomeInsurance(){return null;}

	public PersonalInsurance createPersonalInsurance(){return null;} 
}