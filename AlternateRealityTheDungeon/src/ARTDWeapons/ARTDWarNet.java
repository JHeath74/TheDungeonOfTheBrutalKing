package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDWarNet extends ARTDWeapons {

	public ARTDWarNet() {
		name = "WarNet";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
