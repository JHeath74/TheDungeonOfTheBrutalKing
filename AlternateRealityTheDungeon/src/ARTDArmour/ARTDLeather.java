package ARTDArmour;

import AlternateRealityTheDungeon.ARTDArmour;

public class ARTDLeather extends ARTDArmour {


	
	
	public ARTDLeather() {
		name = "Leather";
		armourDefense = 8;
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();

	}

}
