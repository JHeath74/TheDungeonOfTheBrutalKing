package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Flail extends Weapons {

	public Flail() {
		name = "Flail";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
