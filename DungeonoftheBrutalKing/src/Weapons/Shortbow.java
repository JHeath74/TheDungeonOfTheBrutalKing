package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Shortbow extends Weapons{

	public Shortbow() {
		name = "Shortbow";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
