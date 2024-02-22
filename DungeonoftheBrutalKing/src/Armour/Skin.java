package Armour;

import AlternateRealityTheDungeon.Armour;

public class Skin extends Armour {

	
	public Skin()
	{

		name = "Skin";
		armourDefense = 1;
		requiredStrength = 0;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
		
	}



	
}
