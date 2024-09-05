package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class WarNet extends Weapons {

	public WarNet() {
		name = "WarNet";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
