package Shields;

import DungeonoftheBrutalKing.Shields;

public class Magical_Shield extends Shields{

	public Magical_Shield() {
		name = "Magical Shield";
		requiredStrength = 20;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
