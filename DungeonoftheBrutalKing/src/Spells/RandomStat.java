package Spells;

import DungeonoftheBrutalKing.Spells;

public class RandomStat extends Spells {

	public RandomStat()
	{
		name = "Random Stat";
		requiredint = 30;
		requiredwis = 30;
		charintelligence = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(9).toString();

		isCombatSpell = false;

	}
}
