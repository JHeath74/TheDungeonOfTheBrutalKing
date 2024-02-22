package Shields;

import AlternateRealityTheDungeon.Shields;

public class Magical_Small_Shield extends Shields{

	public Magical_Small_Shield() 
	{
		name = "Magical Spiked Shield";
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
