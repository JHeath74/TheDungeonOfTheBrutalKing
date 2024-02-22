package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDJavelin extends Weapons {

	public ARTDJavelin() {
		name = "Javelin";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
