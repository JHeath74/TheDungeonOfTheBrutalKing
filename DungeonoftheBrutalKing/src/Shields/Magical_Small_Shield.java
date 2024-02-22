package Shields;

import DungeonoftheBrutalKing.Shields;

public class Magical_Small_Shield extends Shields{

	public Magical_Small_Shield()
	{
		name = "Magical Spiked Shield";
		requiredStrength = 20;
		charStrength = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(7);
		defenseProvided = 15;
	}

}
