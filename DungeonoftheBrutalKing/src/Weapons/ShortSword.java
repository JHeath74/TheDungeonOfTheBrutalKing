package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ShortSword extends Weapons {

	public ShortSword() {
		name = "Short Sword";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
