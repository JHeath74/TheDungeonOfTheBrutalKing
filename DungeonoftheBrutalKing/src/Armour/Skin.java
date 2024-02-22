package Armour;

import DungeonoftheBrutalKing.Armour;

public class Skin extends Armour {


	public Skin()
	{

		name = "Skin";
		armourDefense = 1;
		requiredStrength = 0;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();

	}




}
