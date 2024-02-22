package Weapons;

import AlternateRealityTheDungeon.Singleton;
import AlternateRealityTheDungeon.Weapons;

public class ARTDBattleAxe extends Weapons {

	public ARTDBattleAxe() {
		
		super();
		
		name = "Battle Axe";
		requiredStrength = 35;
		charStrength = Singleton.myCharSingleton().CharInfo.get(7).toString();
	}

}
