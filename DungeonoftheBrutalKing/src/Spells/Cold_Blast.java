package Spells;

import DungeonoftheBrutalKing.Spells;

public class Cold_Blast extends Spells
{

	//Damaged Base off of intelligence or Wisdom

	public Cold_Blast()
	{
		name = "Cold Blast";
		requiredint = 30;
		requiredwis = 30;
		charintelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = myChar.myCharSingleton().CharInfo.get(9).toString();

		isCombatSpell = true;


	}

}
