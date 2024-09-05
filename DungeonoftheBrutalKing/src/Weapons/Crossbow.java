package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Crossbow extends Weapons {

	public Crossbow() {
		name = "Cross Bow";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
