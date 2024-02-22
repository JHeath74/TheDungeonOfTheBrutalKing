package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDDart extends Weapons {

	public ARTDDart() {
		name = "Dart";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
