package ARTDArmour;

import AlternateRealityTheDungeon.ARTDArmour;

public class ARTDBreastPlate extends ARTDArmour {

	
	public ARTDBreastPlate()
	{
		name = "Breast Plate";
		armourDefense = 15;	
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();

	}

}
