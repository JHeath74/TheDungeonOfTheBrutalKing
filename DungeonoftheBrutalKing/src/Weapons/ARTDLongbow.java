package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDLongbow extends Weapons {

	public ARTDLongbow() {
		name = "Longbow";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
