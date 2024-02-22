package Weapons;

import AlternateRealityTheDungeon.Weapons;

public class ARTDDart extends Weapons {

	public ARTDDart() {
		name = "Dart";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
