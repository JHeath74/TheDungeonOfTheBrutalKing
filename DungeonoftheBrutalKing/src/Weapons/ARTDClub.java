package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDClub extends Weapons {

	public ARTDClub() {
		name = "Club";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
