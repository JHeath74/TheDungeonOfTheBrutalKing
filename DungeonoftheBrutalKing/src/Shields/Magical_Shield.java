package Shields;

import AlternateRealityTheDungeon.Shields;

public class Magical_Shield extends Shields{

	public Magical_Shield() {
		name = "Magical Shield";
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
