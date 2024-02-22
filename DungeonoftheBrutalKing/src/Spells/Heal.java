package Spells;



import DungeonoftheBrutalKing.Singleton;
import DungeonoftheBrutalKing.Spells;

public class Heal extends Spells {


	public Heal()
	{
		name = "Heal";
		requiredint = 35;
		requiredwis = 35;
		charintelligence = Singleton.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = Singleton.myCharSingleton().CharInfo.get(9).toString();


		isCombatSpell = true;
	}

}
