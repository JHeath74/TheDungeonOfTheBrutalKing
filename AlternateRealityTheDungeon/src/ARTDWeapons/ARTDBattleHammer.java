package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDBattleHammer extends ARTDWeapons {

	public ARTDBattleHammer() {
		name = "Battle Hammer";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
