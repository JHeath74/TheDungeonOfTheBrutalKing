package Armour;

import AlternateRealityTheDungeon.Armour;

public class BreastPlate extends Armour {

	
	public BreastPlate()
	{
		name = "Breast Plate";
		armourDefense = 15;	
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();

	}

}
