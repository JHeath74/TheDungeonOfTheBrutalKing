package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Club extends Weapons {

	public Club() {
		name = "Club";
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
