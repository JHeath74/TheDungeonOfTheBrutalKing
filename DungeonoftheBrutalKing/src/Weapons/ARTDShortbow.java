package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDShortbow extends Weapons{

	public ARTDShortbow() {
		name = "Shortbow";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
