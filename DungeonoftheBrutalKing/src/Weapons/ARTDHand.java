package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDHand extends Weapons {
	
	public ARTDHand() {
		name = "Hand";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
