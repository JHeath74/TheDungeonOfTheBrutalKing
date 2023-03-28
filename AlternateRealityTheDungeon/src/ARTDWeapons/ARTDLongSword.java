package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDLongSword extends ARTDWeapons{

	public ARTDLongSword() {
		name = "Long Sword";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
