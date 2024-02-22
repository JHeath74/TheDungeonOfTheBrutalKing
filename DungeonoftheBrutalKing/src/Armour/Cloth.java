package Armour;

import DungeonoftheBrutalKing.Armour;

public class Cloth extends Armour {




	public Cloth()
	{
		name = "Cloth";
		armourDefense = 5;
		requiredStrength = 10;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();
	}



}
