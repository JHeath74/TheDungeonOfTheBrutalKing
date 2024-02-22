package Shields;

import AlternateRealityTheDungeon.Shields;

public class Magical_Spiked_Shield extends Shields {

	public Magical_Spiked_Shield() {
		
		name = "Magical Spiked Shield";
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
