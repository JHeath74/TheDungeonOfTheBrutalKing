package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDWhip extends Weapons {

	public ARTDWhip() {
		name = "Whip";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
