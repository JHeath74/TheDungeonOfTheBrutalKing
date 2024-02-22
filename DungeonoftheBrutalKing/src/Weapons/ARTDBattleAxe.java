package Weapons;

import DungeonoftheBrutalKing.Singleton;
import DungeonoftheBrutalKing.Weapons;

public class ARTDBattleAxe extends Weapons {

	public ARTDBattleAxe() {

		super();

		name = "Battle Axe";
		requiredStrength = 35;
		charStrength = Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
