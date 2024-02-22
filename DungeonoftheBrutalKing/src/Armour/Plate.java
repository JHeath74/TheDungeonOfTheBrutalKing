package Armour;

import DungeonoftheBrutalKing.Armour;


public class Plate extends Armour {



	public Plate() {
		name = "Breast Plate";
		armourDefense = 15;
		requiredStrength = 40;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
