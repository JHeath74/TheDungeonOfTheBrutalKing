package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDSling extends ARTDWeapons{

	public ARTDSling() {
		name = "Sling";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
