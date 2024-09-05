package Weapons;

import DungeonoftheBrutalKing.Singleton;
import DungeonoftheBrutalKing.Weapons;

public class BattleHammer extends Weapons {

	public BattleHammer() {
		name = "Battle Hammer";
		requiredStrength = 35;
		charStrength = Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
