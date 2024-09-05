package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Javelin extends Weapons {

	public Javelin() {
		name = "Javelin";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
