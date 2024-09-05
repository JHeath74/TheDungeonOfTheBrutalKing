package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Dart extends Weapons {

	public Dart() {
		name = "Dart";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
