package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDLongSword extends Weapons{

	public ARTDLongSword() {
		name = "Long Sword";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
