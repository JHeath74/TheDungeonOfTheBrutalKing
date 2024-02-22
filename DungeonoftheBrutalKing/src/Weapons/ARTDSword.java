package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDSword extends Weapons {

	public ARTDSword() {
		name = "Sword";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
