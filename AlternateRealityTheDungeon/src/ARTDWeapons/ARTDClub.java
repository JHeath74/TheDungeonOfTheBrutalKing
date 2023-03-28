package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDClub extends ARTDWeapons {

	public ARTDClub() {
		name = "Club";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
