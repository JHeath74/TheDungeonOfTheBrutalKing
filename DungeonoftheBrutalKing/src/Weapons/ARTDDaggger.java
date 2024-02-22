package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class ARTDDaggger extends Weapons
{

	public ARTDDaggger()
	{
		name = "Dagger";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}



}
