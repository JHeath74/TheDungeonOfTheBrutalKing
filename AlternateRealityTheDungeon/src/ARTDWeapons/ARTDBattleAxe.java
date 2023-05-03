package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDSingleton;
import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDBattleAxe extends ARTDWeapons {

	public ARTDBattleAxe() {
		
		super();
		
		name = "Battle Axe";
		requiredStrength = 35;
		charStrength = ARTDSingleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
