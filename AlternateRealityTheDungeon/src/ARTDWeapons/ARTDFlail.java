package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDFlail extends ARTDWeapons {

	public ARTDFlail() {
		name = "Flail";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
