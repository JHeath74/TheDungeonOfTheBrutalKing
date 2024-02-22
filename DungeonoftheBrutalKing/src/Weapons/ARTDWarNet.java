package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDWarNet extends Weapons {

	public ARTDWarNet() {
		name = "WarNet";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
