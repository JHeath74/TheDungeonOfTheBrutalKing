package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Sling extends Weapons{

	public Sling() {
		name = "Sling";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
