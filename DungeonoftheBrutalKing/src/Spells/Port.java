package Spells;

import DungeonoftheBrutalKing.Spells;

public class Port extends Spells{

	public Port()
	{
		name = "Port";
		requiredint = 30;
		requiredwis = 30;
		charintelligence = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(9).toString();

		isCombatSpell = false;

	}
}
