package Spells;

import DungeonoftheBrutalKing.Singleton;
import DungeonoftheBrutalKing.Spells;

public class Fireball extends Spells{


	public Fireball() {

		name = "FireBall";
		requiredint = 20;
		requiredwis = 20;
		charintelligence = Singleton.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = Singleton.myCharSingleton().CharInfo.get(9).toString();

		isCombatSpell = true;
	}



}
