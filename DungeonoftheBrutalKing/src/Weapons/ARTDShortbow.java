package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDShortbow extends Weapons{

	public ARTDShortbow() {
		name = "Shortbow";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
