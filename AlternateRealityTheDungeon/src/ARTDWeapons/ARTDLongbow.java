package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDLongbow extends ARTDWeapons {

	public ARTDLongbow() {
		name = "Longbow";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
