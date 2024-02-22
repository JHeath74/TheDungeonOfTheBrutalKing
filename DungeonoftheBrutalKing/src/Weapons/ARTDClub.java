package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDClub extends Weapons {

	public ARTDClub() {
		name = "Club";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
