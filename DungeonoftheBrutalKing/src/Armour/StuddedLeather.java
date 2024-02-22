package Armour;

import DungeonoftheBrutalKing.Armour;

public class StuddedLeather extends Armour {



	public StuddedLeather() {
		name = "Studded Leather";
		armourDefense = 8;
		requiredStrength = 15;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
