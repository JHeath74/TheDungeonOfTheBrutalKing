package Shields;

import DungeonoftheBrutalKing.Shields;

public class Small_Shield extends Shields {



	public Small_Shield()
	{

		name = "Small Shield";
		requiredStrength = 20;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
