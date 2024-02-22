package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDSling extends Weapons{

	public ARTDSling() {
		name = "Sling";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
