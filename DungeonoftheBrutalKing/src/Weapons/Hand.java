package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Hand extends Weapons {

	public Hand() {
		name = "Hand";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
