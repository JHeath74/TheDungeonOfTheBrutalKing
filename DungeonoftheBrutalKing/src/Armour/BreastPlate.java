package Armour;

import DungeonoftheBrutalKing.Armour;

public class BreastPlate extends Armour {


	public BreastPlate()
	{
		name = "Breast Plate";
		armourDefense = 15;
		requiredStrength = 35;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7).toString();

	}

}
