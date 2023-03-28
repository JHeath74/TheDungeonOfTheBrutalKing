package ARTDArmour;

import AlternateRealityTheDungeon.ARTDArmour;

public class ARTDStuddedLeather extends ARTDArmour {


	
	public ARTDStuddedLeather() {
		name = "Studded Leather";
		armourDefense = 8;
		requiredStrength = 15;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
