package Spells;

import DungeonoftheBrutalKing.Spells;

public class Conjure_Food extends Spells
{



	public Conjure_Food()
	{
		name = "Conjure Food";

		requiredint = 20;
		requiredwis = 20;
		foodconjured = 2;
		charintelligence = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = DungeonoftheBrutalKing.Singleton.myCharSingleton().CharInfo.get(9).toString();

		isCombatSpell = false;

	}

}
