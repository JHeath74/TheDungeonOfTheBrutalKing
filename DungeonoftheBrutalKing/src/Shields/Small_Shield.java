package Shields;

import AlternateRealityTheDungeon.Shields;

public class Small_Shield extends Shields {

	
	
	public Small_Shield()
	{
		
		name = "Small Shield";
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
