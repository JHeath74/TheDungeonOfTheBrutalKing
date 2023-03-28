package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDDart extends ARTDWeapons {

	public ARTDDart() {
		name = "Dart";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
