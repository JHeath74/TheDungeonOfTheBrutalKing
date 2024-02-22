package Shields;

import DungeonoftheBrutalKing.Shields;

public class Spiked_Shield extends Shields {

	public Spiked_Shield() {

		name = "Spiked Shield";
		requiredStrength = 20;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
