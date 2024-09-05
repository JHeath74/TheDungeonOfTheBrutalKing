package Weapons;

import DungeonoftheBrutalKing.Singleton;
import DungeonoftheBrutalKing.Weapons;

public class BattleAxe extends Weapons {

	public BattleAxe() {

		super();

		name = "Battle Axe";
		requiredStrength = 35;
		charStrength = Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
