package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Stilleto extends Weapons{

	public Stilleto()
	{
		name = "Stilleto";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
