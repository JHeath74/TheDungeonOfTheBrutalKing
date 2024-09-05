package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class LongSword extends Weapons{

	public LongSword() {
		name = "Long Sword";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
