package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDSword extends ARTDWeapons {

	public ARTDSword() {
		name = "Sword";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
