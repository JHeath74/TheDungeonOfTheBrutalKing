package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDJavelin extends ARTDWeapons {

	public ARTDJavelin() {
		name = "Javelin";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
