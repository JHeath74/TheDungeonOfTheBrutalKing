package Spells;

import AlternateRealityTheDungeon.Spells;

public class RandomStat extends Spells {

	public RandomStat()
	{
		name = "Random Stat";
		requiredint = 30;
		requiredwis = 30;
		charintelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = myChar.myCharSingleton().CharInfo.get(9).toString();
		
		isCombatSpell = false;
		
	}
}
