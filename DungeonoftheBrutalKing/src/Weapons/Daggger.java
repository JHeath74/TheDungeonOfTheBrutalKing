package Weapons;

import DungeonoftheBrutalKing.Weapons;

public class Daggger extends Weapons
{

	public Daggger()
	{
		name = "Dagger";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}



}
