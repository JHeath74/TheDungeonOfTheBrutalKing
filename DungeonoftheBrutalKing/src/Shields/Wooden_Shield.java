package Shields;

import AlternateRealityTheDungeon.Shields;

public class Wooden_Shield extends Shields {

	public Wooden_Shield() {
		
		name = "Wooden Shield";
		requiredStrength = 15;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
