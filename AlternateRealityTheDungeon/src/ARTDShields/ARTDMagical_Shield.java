package ARTDShields;

import AlternateRealityTheDungeon.ARTDShields;

public class ARTDMagical_Shield extends ARTDShields{

	public ARTDMagical_Shield() {
		name = "Magical Shield";
		requiredStrength = 20;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
