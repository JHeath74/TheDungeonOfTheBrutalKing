package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDSingleton;
import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDBattleHammer extends ARTDWeapons {

	public ARTDBattleHammer() {
		name = "Battle Hammer";
		requiredStrength = 35;
		charStrength = ARTDSingleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
