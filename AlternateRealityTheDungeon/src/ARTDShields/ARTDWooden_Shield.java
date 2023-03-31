package ARTDShields;

import AlternateRealityTheDungeon.ARTDShields;

public class ARTDWooden_Shield extends ARTDShields {

	public ARTDWooden_Shield() {
		
		name = "Wooden Shield";
		requiredStrength = 15;
		charStrength = myChar.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
