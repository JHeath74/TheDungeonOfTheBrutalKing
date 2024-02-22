package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDLongSword extends Weapons{

	public ARTDLongSword() {
		name = "Long Sword";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
