package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDShortSword extends ARTDWeapons {

	public ARTDShortSword() {
		name = "Short Sword";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
