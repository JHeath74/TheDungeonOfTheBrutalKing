package ARTDShields;

import AlternateRealityTheDungeon.ARTDShields;

public class ARTDSmall_Shield extends ARTDShields {

	
	
	public ARTDSmall_Shield()
	{
		
		name = "Small Shield";
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
