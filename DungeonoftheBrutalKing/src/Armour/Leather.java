package Armour;

import DungeonoftheBrutalKing.Armour;

public class Leather extends Armour {




	public Leather() {
		name = "Leather";
		armourDefense = 8;
		requiredStrength = 20;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();

	}

}
