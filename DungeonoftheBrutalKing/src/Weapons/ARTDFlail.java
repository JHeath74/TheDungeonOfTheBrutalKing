package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDFlail extends Weapons {

	public ARTDFlail() {
		name = "Flail";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
