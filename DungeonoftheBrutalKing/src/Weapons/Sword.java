package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Sword extends Weapons {

	public Sword() {
		name = "Sword";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
