package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Whip extends Weapons {

	public Whip() {
		name = "Whip";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
