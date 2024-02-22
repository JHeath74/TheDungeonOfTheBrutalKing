package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDCrossbow extends Weapons {

	public ARTDCrossbow() {
		name = "Cross Bow";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
