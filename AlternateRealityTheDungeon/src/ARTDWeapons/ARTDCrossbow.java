package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDCrossbow extends ARTDWeapons {

	public ARTDCrossbow() {
		name = "Cross Bow";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
