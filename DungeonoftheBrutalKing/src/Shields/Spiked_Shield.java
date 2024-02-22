package Shields;

import AlternateRealityTheDungeon.Shields;

public class Spiked_Shield extends Shields {

	public Spiked_Shield() {
		
		name = "Spiked Shield";
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
