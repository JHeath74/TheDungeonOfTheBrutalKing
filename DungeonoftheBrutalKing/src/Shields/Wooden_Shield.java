package Shields;

import DungeonoftheBrutalKing.Shields;

public class Wooden_Shield extends Shields {

	public Wooden_Shield() {

		name = "Wooden Shield";
		requiredStrength = 15;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
