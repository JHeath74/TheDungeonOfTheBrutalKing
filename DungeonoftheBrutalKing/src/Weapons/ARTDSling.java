package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDSling extends Weapons{

	public ARTDSling() {
		name = "Sling";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
