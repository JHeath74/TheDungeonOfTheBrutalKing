package Spells;

import DungeonoftheBrutalKing.Spells;

public class Shield extends Spells {

	public Shield()
	{
		name = "Shield";
		requiredint = 30;
		requiredwis = 30;
		charintelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = myChar.myCharSingleton().CharInfo.get(9).toString();

		isCombatSpell = true;

	}
}
