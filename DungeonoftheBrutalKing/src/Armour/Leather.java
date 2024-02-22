package Armour;

import AlternateRealityTheDungeon.Armour;

public class Leather extends Armour {


	
	
	public Leather() {
		name = "Leather";
		armourDefense = 8;
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();

	}

}
