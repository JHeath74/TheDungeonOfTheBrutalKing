package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDSword extends Weapons {

	public ARTDSword() {
		name = "Sword";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
