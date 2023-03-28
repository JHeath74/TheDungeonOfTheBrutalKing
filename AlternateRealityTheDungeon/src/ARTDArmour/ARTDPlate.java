package ARTDArmour;

import AlternateRealityTheDungeon.ARTDArmour;


public class ARTDPlate extends ARTDArmour {


	
	public ARTDPlate() {
		name = "Breast Plate";
		armourDefense = 15;	
		requiredStrength = 40;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
