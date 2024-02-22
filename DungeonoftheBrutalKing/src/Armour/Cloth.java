package Armour;

import AlternateRealityTheDungeon.Armour;

public class Cloth extends Armour {

	

	
	public Cloth()
	{
		name = "Cloth";
		armourDefense = 5;	
		requiredStrength = 10;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}



}
