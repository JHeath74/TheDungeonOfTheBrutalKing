package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDShortbow extends ARTDWeapons{

	public ARTDShortbow() {
		name = "Shortbow";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
