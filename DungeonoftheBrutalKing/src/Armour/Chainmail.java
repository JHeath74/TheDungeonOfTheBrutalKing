package Armour;

import DungeonoftheBrutalKing.Armour;

public class Chainmail extends Armour {



	public Chainmail()
	{
		name = "Chain";
		armourDefense = 12;
		requiredStrength = 30;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
