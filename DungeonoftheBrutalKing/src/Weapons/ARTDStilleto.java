package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDStilleto extends Weapons{

	public ARTDStilleto()
	{
		name = "Stilleto";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
