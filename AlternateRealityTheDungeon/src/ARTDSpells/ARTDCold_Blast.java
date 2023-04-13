package ARTDSpells;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDCold_Blast extends ARTDSpells
{
	
	//Damaged Base off of intelligence or Wisdom
	
	public ARTDCold_Blast() 
	{
		name = "Cold Blast";
		requiredint = 30;
		requiredwis = 30;
		charintelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = myChar.myCharSingleton().CharInfo.get(9).toString();
		
		isCombatSpell = true;

		
	}

}
