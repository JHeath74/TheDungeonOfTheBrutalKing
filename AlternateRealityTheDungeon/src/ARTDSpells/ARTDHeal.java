package ARTDSpells;



import AlternateRealityTheDungeon.ARTDSingleton;
import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDHeal extends ARTDSpells {


	public ARTDHeal() 
	{
		name = "Heal";
		requiredint = 35;
		requiredwis = 35;
		charintelligence = ARTDSingleton.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = ARTDSingleton.myCharSingleton().CharInfo.get(9).toString();

		
		isCombatSpell = true;
	}

}
