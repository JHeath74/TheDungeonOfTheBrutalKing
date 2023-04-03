package ARTDSpells;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDConjure_Food extends ARTDSpells 
{


	
	public ARTDConjure_Food()
	{
		name = "Conjure Food";
		
		requiredint = 20;
		requiredwis = 20;
		foodconjured = 2;
		charintelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = myChar.myCharSingleton().CharInfo.get(9).toString();
		
		isCombatSpell = false;
				
	}

}
