package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDBattleAxe extends ARTDWeapons {

	public ARTDBattleAxe() {
		
		name = "Battle Axe";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
