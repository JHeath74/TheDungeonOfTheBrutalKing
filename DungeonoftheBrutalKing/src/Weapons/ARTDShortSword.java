package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDShortSword extends Weapons {

	public ARTDShortSword() {
		name = "Short Sword";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
