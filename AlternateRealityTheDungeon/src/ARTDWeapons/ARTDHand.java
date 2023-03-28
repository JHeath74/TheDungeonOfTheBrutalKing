package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDHand extends ARTDWeapons {
	
	public ARTDHand() {
		name = "Hand";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
