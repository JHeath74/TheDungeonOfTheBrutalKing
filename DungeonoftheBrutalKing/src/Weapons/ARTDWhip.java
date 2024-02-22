package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDWhip extends Weapons {

	public ARTDWhip() {
		name = "Whip";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
