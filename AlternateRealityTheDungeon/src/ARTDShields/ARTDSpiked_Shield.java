package ARTDShields;

import AlternateRealityTheDungeon.ARTDShields;

public class ARTDSpiked_Shield extends ARTDShields {

	public ARTDSpiked_Shield() {
		
		name = "Spiked Shield";
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
