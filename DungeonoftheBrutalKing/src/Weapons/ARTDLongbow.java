package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDLongbow extends Weapons {

	public ARTDLongbow() {
		name = "Longbow";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
