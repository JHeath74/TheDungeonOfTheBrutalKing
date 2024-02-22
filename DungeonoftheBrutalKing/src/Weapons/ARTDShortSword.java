package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDShortSword extends Weapons {

	public ARTDShortSword() {
		name = "Short Sword";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
