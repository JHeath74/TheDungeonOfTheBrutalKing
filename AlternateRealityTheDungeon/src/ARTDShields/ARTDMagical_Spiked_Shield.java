package ARTDShields;

import AlternateRealityTheDungeon.ARTDShields;

public class ARTDMagical_Spiked_Shield extends ARTDShields {

	public ARTDMagical_Spiked_Shield() {
		
		name = "Magical Spiked Shield";
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
