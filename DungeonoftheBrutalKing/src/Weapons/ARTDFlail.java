package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDFlail extends Weapons {

	public ARTDFlail() {
		name = "Flail";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
