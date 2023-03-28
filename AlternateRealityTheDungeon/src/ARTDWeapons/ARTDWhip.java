package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDWhip extends ARTDWeapons {

	public ARTDWhip() {
		name = "Whip";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
