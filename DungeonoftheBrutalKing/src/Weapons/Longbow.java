package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Longbow extends Weapons {

	public Longbow() {
		name = "Longbow";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
